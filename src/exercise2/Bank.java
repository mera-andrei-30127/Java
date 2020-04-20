package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> account = new ArrayList<>();

    public String executeTranzaction(Transaction t) {
        return t.execute();
    }

    public Bank(List<Account> account) {
        this.account.addAll(account);
    }

    public Account getAcountByCardId(String cardId) {
        for (int i = 1; i <= account.size(); i++){
            if(account.get(Integer.parseInt(cardId)).getCard().getCardId().equals(cardId)){
                return account.get(Integer.parseInt(cardId));
            }
        }
        return null;
    }

}
