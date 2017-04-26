package Code.FRPG;
import java.util.*;
/**
 *
 * @author Tim
 */
public class CompanionInventory {
  private Companion friend; 
  public ArrayList<Companion> compInventory;
  
  public CompanionInventory()
    {
      compInventory = new ArrayList<>();
    }
  public void foundCompanion(Companion friend)
  {
      this.friend = friend;
      compInventory.add(friend);
  }
    public Companion getCompanion(int pos){
        for (Companion n : compInventory){
            System.out.println(friend);
            return compInventory.get(pos);
        }
        return compInventory.get(0);
    }

    
}