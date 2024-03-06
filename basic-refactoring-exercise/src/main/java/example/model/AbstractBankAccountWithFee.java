package example.model;

/**
 * This abstract class defines a generic bank account that includes fee.
 */
public abstract class AbstractBankAccountWithFee implements BankAccount {

    private double balance;
    private final AccountHolder holder;
    protected double fee;
    
    public AbstractBankAccountWithFee (final double balance, final AccountHolder holder, final double fee) {
        this.balance = balance;
        this.holder = holder;
        this.fee = fee;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public AccountHolder getHolder() {
        return this.holder;
    }

    @Override
    public void deposit(final int userID, final double amount) {
        if (checkUser(userID)) {
            this.balance = this.balance + amount - this.fee;
        }
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance = this.balance - amount - this.fee;
        }
    }

    @Override
    public double getFee() {
        return this.fee;
    }

    protected boolean isWithdrawAllowed(final double amount) {
        return this.balance >= amount + this.fee;
    }

    protected boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
}
