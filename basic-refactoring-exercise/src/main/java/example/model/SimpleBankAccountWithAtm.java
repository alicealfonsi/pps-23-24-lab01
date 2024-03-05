package example.model;

/**
 * This class implements a new version of a BankAccount, allowing the deposit and the withdrawal
 * also using the ATM. Each transaction done with the ATM implies paying a 1$ fee.
 */

public class SimpleBankAccountWithAtm extends AbstractBankAccountWithFee {

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        super(balance, holder, 1);
    }

}
