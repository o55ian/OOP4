package project.Model;

import java.util.UUID;

public class Items {
    private UUID mID;
    private String mName;
    private Double mPrice;

    public Items(String name, Double price) {
        mID = UUID.randomUUID();
        mName = name;
        mPrice = price;
    }

    public UUID getID() { return mID; }

    public String getName() { return mName; }
}
