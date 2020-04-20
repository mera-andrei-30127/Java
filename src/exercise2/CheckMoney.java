package isp.lab6.exercise3;

public class CheckMoney extends Transaction {

    public CheckMoney(Account account) {
        this.account = account;
    }

    @Override
    public String execute() {
        return "current money: " + account.getBalance();
    }
}
