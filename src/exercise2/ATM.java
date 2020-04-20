package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private Bank bank;
    List<Card> cards = new ArrayList<>();
    private Transaction[] transactions = new Transaction[3];
    Card card;

    public ATM(Bank bank, List<Card> cards) {
        this.bank = bank;
        this.cards.addAll(cards);
    }

    /*This implements the operation consist in changing pin of a card belong to an account.*/
    public void changePin(String oldPin, String newPin) {
        if (card.getPin().equals(oldPin)) {
            Account account = this.bank.getAcountByCardId(this.card.getCardId());
            this.transactions[0] = new ChangePin(oldPin, newPin, account);
            bank.getAcountByCardId(card.getCardId()).getCard().setPin(this.bank.executeTranzaction(transactions[0]));
            System.out.println("new pin is: " + bank.getAcountByCardId(card.getCardId()).getCard().getPin());
        } else {
            System.out.println("Old pin is not valid");
        }
    }

    public void withdraw(double amount) {
        if (this.bank.getAcountByCardId(this.card.getCardId()).getBalance() - amount > 0) {
            Account account = this.bank.getAcountByCardId(this.card.getCardId());
            this.transactions[1] = new WithdrawMoney(amount, account);
            System.out.println(this.bank.executeTranzaction(transactions[1]));
        } else {
            System.out.println("Not enough founds " + bank.getAcountByCardId(card.getCardId()).getBalance());
        }
    }

    public void checkMoney() {
        Account account = this.bank.getAcountByCardId(this.card.getCardId());
        this.transactions[2] = new CheckMoney(account);
        System.out.println(this.bank.executeTranzaction(this.transactions[2]));
    }

    public boolean insertCard(Card card, String pin) {
        if (card != null && card.getPin().equals(pin)) {
            this.card = card;
            return true;
        }
        return false;
    }

    public void removeCard() {
        this.card = null;
        System.out.println("the card was removed");
    }

}
