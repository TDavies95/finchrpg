package Code.FRPG;
import java.util.*;
/**
 *
 * @author Tim
 */
public class Inventory {
   
  private Map<String, Integer> map = new HashMap<String, Integer>();
  private String name;
  private boolean stack;
  public ArrayList<Item> inventory;
  
  public Inventory()
    {
      name = "";
      stack = false;
      //inventory = new ArrayList<>();
    }
  public void foundItem(Item item)
  {
    name = item.getName();
    stack = item.getStackable();
    if(map.containsKey(name) == true && stack == true)
    {
      if(map.get(name) <= 30)
      {
        int temp = map.get(name) + 1;
        map.put(name,temp);
      }
      else
        System.out.println(name + " is full");
    }
    else
    {
      map.put(name,1);
      inventory.add(item);
    }
  }
    public Item getItem(int pos){
        for (Item n : inventory){
            return inventory.get(pos);
        }
        return inventory.get(0);
    }
    public void useItem(Item item)
    {
      if( item.getStackable() == true)
        map.put(item.getName(),map.get(item.getName()) - 1);
    }
    
}