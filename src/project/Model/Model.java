package project.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class Model {

    public HashMap<UUID, Items> mItems;
    public ArrayList<TransactionHistory> mTransactionHistory;

    public Model() {
        mItems = new HashMap<UUID, Items>();
    }

    public Collection<Items> getItemList() { return mItems.values(); }
    public void addItem(Items item) { mItems.put(item.getID(), item); }
    public void removeItem(UUID id) { mItems.remove(id); }
    public Items getItemByID(UUID id) { return mItems.get(id); }


    public Collection<TransactionHistory> getTransactionForItem(Items item) {
        ArrayList<TransactionHistory> itemTransactions = new ArrayList<>();
        for (TransactionHistory transactionHistory : mTransactionHistory) {
            if (item.getID().equals(transactionHistory.getItems().getID())) {
                itemTransactions.add(transactionHistory);
            }
        }
        return itemTransactions;
    }

    public Double getTotal(){
        Double totalProfit = 0.0;
        for (TransactionHistory transactions : mTransactionHistory) {
            totalProfit += transactions.getAmount();
        }
        return totalProfit;
    }
}
