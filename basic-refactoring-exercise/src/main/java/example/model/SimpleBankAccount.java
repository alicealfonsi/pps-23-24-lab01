package example.model;

/**
 * This class represents a particular instance of a BankAccount.
 * In particular, a Simple Bank Account allows always the deposit
 * while the withdrawal is allowed only if the balance is greater or equal to the withdrawal amount.
 */
public class SimpleBankAccount extends AbstractBankAccountWithFee {

    public SimpleBankAccount(final AccountHolder holder, final double balance) {
        super(balance, holder, 0);
    }
}