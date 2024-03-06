import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import example.model.AccountHolder;
import example.model.BankAccount;

/**
 * This abstract class defines test methods for testing a generic bank account that includes fee.
 */
public abstract class AbstractBankAccountWithFeeTest {

    protected AccountHolder accountHolder;
    protected BankAccount bankAccount;
    protected double fee;

    @Test
    void testInitialBalance() {
        double initialBalance = 0;
        assertEquals(initialBalance, this.bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        double depositAmount = 100;
        this.bankAccount.deposit(this.accountHolder.getId(), depositAmount);
        assertEquals(depositAmount - this.fee, this.bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        double depositAmount = 100;
        double wrongDepositAmount = 50;
        this.bankAccount.deposit(this.accountHolder.getId(), depositAmount);
        this.bankAccount.deposit(2, wrongDepositAmount);
        assertEquals(depositAmount - this.fee, this.bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        double depositAmount = 100;
        double withdrawAmount = 70;
        this.bankAccount.deposit(this.accountHolder.getId(), depositAmount);
        this.bankAccount.withdraw(this.accountHolder.getId(), withdrawAmount);
        assertEquals(depositAmount - withdrawAmount - 2*this.fee, this.bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        double depositAmount = 100;
        double wrongWithdrawAmount = 70;
        this.bankAccount.deposit(this.accountHolder.getId(), depositAmount);
        this.bankAccount.withdraw(2, wrongWithdrawAmount);
        assertEquals(depositAmount - this.fee, this.bankAccount.getBalance());
    }
}
