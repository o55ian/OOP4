package project.Model;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class Model {

    public HashMap<UUID, Items> mItems;

    public Model() {
        mItems = new HashMap<UUID, Items>();
    }

    public Collection<Items> getItemList() { return mItems.values(); }
    public void addItem(Items item) { mItems.put(item.getID(), item); }
    public void removeItem(UUID id) { mItems.remove(id); }
    public Items getItemByID(UUID id) { return mItems.get(id); }

}
