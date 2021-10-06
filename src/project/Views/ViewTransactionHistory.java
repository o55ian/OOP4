package project.Views;

import project.Model.Items;
import project.Model.TransactionHistory;
import project.Utilities;

import java.util.Collection;
import java.util.UUID;

public class ViewTransactionHistory {
    //print out list of items
    public void listItems(Collection<Items> itemList){
        for (Items item : itemList) {
            System.out.println(item);
        }
        //prompt user for item id
        System.out.println(Utilities.line() + "Please enter item ID:\n");
    }

    //input item id
    public UUID readItemID(){
        String input = Utilities.stringInput();
        UUID itemID = UUID.fromString(input);

        return itemID;
    }
    //render data
    public void showTransactionData(Items item, TransactionHistory transactionHistory){
        /*Transactions for item: <item ID>: <item name>. <unit price> SEK
        <item ID>: <amount>  item(s). <purchase price> SEK
        */
        String output = "Transactions for items: " + item.getID().toString() + " : ";
        output += item.getName() + ". ";
        output += item.getPrice() + " SEK\n";

        output += item.getID().toString() + ": ";
        output += transactionHistory.getQuantity() + " item(s). ";
        output += transactionHistory.totalSum() + " SEK";

        System.out.println(Utilities.line() + output);

    }
    //changed failure message to correspond with feature outline (not sure if this works, should be using itemID line 23
    //item search failure
    public void queryFailed(){
        System.out.println("item " + readItemID().toString() + " was not registered yet." );
    }

    //item found but no purchase made
    public void registeredItemNotBought(Items item){
        //Transactions for item: <item ID>: <item name>. <unit price> SEK
        //No transactions have been registered for item <item ID> yet.
        System.out.println("Transactions for item: " + item.getID().toString() + " :" + item.getName()
                + ". " + item.getPrice() + " SEK");
        System.out.println("No transactions have been registered for item " + item.getID().toString() + " yet.");
    }
    //return to previous menu
    public void returnTransactionOptions(){
        System.out.println("Returning to previous menu.");
    }
    //total values

}

