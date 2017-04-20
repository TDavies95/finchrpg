package Code.FRPG;
import java.util.*;
  public class Room {
    Monster mon[] = new Monster[6];
    String name;
    int id;
    public Monster getMon(int pos){
     return mon[pos];   
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}