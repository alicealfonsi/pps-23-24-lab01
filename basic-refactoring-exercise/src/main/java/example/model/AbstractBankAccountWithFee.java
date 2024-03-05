package example.model;

public abstract class AbstractBankAccountWithFee implements BankAccount {

    private double balance;
    private AccountHolder holder;
    private double fee;
    
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
            this.balance = this.balance + amount - fee;
        }
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance = this.balance - amount - fee;
        }
    }

    protected boolean isWithdrawAllowed(final double amount) {
        return this.balance >= amount + fee;
    }

    protected boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }

    protected void setFee(final double fee) {
        this.fee = fee;
    }

}
