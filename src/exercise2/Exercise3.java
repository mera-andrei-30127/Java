package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("0", "0345"));
        cards.add(new Card("1", "1342"));
        cards.add(new Card("2", "1365"));


        List<Account> account = new ArrayList<>();
        account.add(new Account("Ion", 30.5, cards.get(0)));
        account.add(new Account("Ion1", 50.5, cards.get(1)));
        account.add(new Account("Ion2", 80.5, cards.get(2)));

        Bank bank = new Bank(account);
        ATM atm = new ATM(bank, cards);

        int option;
        Scanner scanner = new Scanner(System.in);
        boolean operation = true;
        /* This structure is an interactive basic menu that can apply different types of operation tu an existent card
        until it is removed.
         */
        while (operation) {
            System.out.println("1:Change pin, 2: withdraw money, 3:Check money, 4:Insert card, 5:Remove card, 6:Exit");
            option = scanner.nextInt();
            switch (option) {

                case 1: {
                    System.out.println("Give old pin:");
                    String oldPin = scanner.next();
                    System.out.println("Give new pin:");
                    String newPin = scanner.next();
                    atm.changePin(oldPin, newPin);
                    break;
                }
                case 2: {
                    System.out.println("Give amount:");
                    double amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                }
                case 3: {
                    atm.checkMoney();
                    break;
                }
                case 4: {
                    System.out.println("Give pin and card id");
                    String pin = scanner.next();
                    String cardId = scanner.next();
                    for (int i = 0; i < 3; i++)
                        if (cards.get(i).getCardId().equals(cardId)) {
                            if (atm.insertCard(cards.get(i), pin)) {
                                System.out.println("card insert");
                            } else {
                                System.out.println("Card dont exist");
                            }
                        }
                    break;

                }
                case 5: {
                    atm.removeCard();
                    break;
                }
                case 6:{
                    atm.removeCard();
                    operation = false;
                    break;
                }

            }
        }
    }
}
