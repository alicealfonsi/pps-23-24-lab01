package example.model;

/**
 * This class implements a new version of a BankAccount, allowing the deposit and 
 * the withdrawal also using the ATM. Each transaction done with the ATM implies paying a 1$ fee.
 */

public class SimpleBankAccountWithAtm extends SimpleBankAccount {

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }
    
    @Override
    public void deposit(final int userID, final double amount) {
        if (checkUser(userID)) {
            super.setBalance(super.getBalance() + amount - 1);
        }
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            super.setBalance(super.getBalance() - amount - 1);
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return super.getBalance() >= amount +1;
    }

}
