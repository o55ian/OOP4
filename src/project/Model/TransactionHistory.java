package project.Model;
public class TransactionHistory {
    private Items mItems;
    private double mAmount;

    private TransactionHistory (Items items, double amount){
        mItems = items;
        mAmount = amount;
    }

    public Items getItems(){
        return mItems;
    }

    public double getAmount(){
        return mAmount;
    }

    @Override
    public String toString() {
        String retValue = (mItems.getID() + ": ");
        retValue += (getAmount() + "item(s). ");
        retValue += (" SEK");


        return retValue;
    }

}
