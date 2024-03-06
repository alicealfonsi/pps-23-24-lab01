import example.model.AccountHolder;
import example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;

/**
 * The test suite for testing the SimpleBankAccount implementation.
 */
public class SimpleBankAccountTest extends AbstractBankAccountWithFeeTest {
    
    @BeforeEach
    void beforeEach() {
        this.accountHolder = new AccountHolder("Mario", "Rossi", 1);
        this.bankAccount = new SimpleBankAccount(accountHolder, 0);
        this.fee = this.bankAccount.getFee();
    }
}