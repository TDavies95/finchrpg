/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Tim
 */
public class RPGClient {
    // TD - Instantiating and constructors created 
    public static void main(final String [] args){
        Finch combatFinch = new Finch();
        Finch mapFinch = new Finch();
        Scanner kb = new Scanner(System.in);
        Tank myPlayer = new Tank();
        System.out.println("Welcome Adventurer, I see you've chose the " + myPlayer.getMyClass());
        System.out.println(myPlayer.toString());
        combatFinch.sleep(5000);
        int a = 0;
        Dungeon dungeon = new Dungeon();
        Room r = new Room();
       
        r = dungeon.getRoom(1);
        Monster firstEncounter = r.mon[1];
        
        while(true){
            combatFinch.setLED(255,0,0);
            mapFinch.setLED(0,255,0);
           
            if(a==0){
            mapFinch.setWheelVelocities(200,200,4000);
            mapFinch.sleep(4000);
            a=1;
            }
            if(a==1){
                System.out.println("You encounter a " + firstEncounter);
                a = 2;
               
            }

        }
        
        
        //mapFinch.quit();
        //combatFinch.quit();
        //System.exit(0);
        
    }
}
