package isp.lab6.exercise3;

public class ChangePin extends Transaction {
    public String oldPin;
    public String newPin;

    public ChangePin(String oldPin, String newPin, Account account) {
        this.oldPin = oldPin;
        this.newPin = newPin;
        this.account = account;
    }

    @Override
    public String execute() {
        oldPin = newPin;
        return oldPin;
    }
}
