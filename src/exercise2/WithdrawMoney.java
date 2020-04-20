package isp.lab6.exercise3;

public class WithdrawMoney extends Transaction {
    public double amount;

    public WithdrawMoney(double amount, Account account) {
        this.amount = amount;
        this.account = account;
    }

    @Override
    public String execute() {
        double withdraw;
        withdraw = account.getBalance() - amount;
        account.setBalance(withdraw);
        return "" + withdraw;

    }
}
