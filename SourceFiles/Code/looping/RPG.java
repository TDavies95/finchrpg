package Code.looping;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;
/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class RPG
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      Finch scaredFinch = new Finch();
      
      // Write some code here!
      
      while(true){
          if(myFinch.isTapped()){
              myFinch.setLED(Color.RED,250);
              myFinch.saySomething("Don't touch me");
              
          }
          if(scaredFinch.isTapped()){
              myFinch.setLED(Color.RED,250);
              scaredFinch.setLED(Color.BLUE,250);
              myFinch.saySomething("Don't touch my friend.");
          }
      }
      
      // Always end your program with finch.quit()
      //myFinch.quit();
     // System.exit(0);
      }
   }