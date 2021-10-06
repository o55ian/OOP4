package project.Model;
public class TransactionHistory {
    private Items mItems;
    private Integer mQuantity;

    private TransactionHistory (Items items, Integer quantity){
        mItems = items;
        mQuantity = quantity;
    }

    public Items getItems(){
        return mItems;
    }

    public double getQuantity(){
        return mQuantity;
    }

    public double totalSum(){
        double total = getItems().getPrice() * getQuantity();
        return total;
    }

}
