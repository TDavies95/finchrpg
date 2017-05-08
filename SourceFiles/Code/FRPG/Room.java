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
    
    public boolean isEmpty(){
        int counter = 0;
        for(int i = 0; mon.length>0;i++){
            if(mon[i].getHealth()>=0){
                counter++;
            }
            if (counter == 6){
                return true;
            }
        }
        return false;
    }
    public String getName() {
        return name;
    }


}