package project.Views;

import project.Model.Items;
import project.Utilities;

import java.util.UUID;

public class ViewCreateItem {
    public Items enterItemData() {
        String name;
        Double price;

        System.out.println(Utilities.line() + "Creating an Item. Please enter the item's:\n " +
                "Name:");
        name = Utilities.stringInput();
        System.out.println("Price:");
        price = Utilities.doubleInput();

        Items items = null;

        if ( !(null == name || price <= 0) ) {
           items = new Items(name, price);
        } else {
            creationFailed();
        }
        return items;
    }

    public void creationSuccess(UUID id) {
        System.out.println("Item <" + id + "> was registered successfully." );
    }

    public void creationFailed() { System.out.println("Invalid data for item."); }

}
