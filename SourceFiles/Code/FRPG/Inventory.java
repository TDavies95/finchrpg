package Code.FRPG;
import java.util.*;
/**
 *
 * @author Tim
 */
public class Inventory {
    private static ArrayList<Item> inventory = new ArrayList<Item>();

    /**
     * @return the inventory
     */
    public static ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * @param aInventory the inventory to set
     */
    public static void setInventory(ArrayList<Item> aInventory) {
        inventory = aInventory;
    }
    /**
     * @return the map
     */
    public void addItem(Item i, int ind){
        inventory.add(ind, i);
    }
    public void removeItem(int ind){
        inventory.remove(ind);
    }
    public Item getItem(int i){
        return inventory.get(i);
    }
    public Item changeQ(int i, int c){
        inventory.get(i).changeQ(c);
        return inventory.get(i);
    }
    public String toString(){
        return inventory.get(0).getName();
        
    }
}