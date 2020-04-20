package isp.lab6.exercise3;

public class Account {
    private String owner;
    private double balance;
    private Card card;

    public Account(String owner, double balance, Card card) {
        this.owner = owner;
        this.balance = balance;
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
