package Code.looping;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class Hitter
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      while(true){
      if (myFinch.isTapped()){
       myFinch.saySomething("Don't touch me");   
      }
      }
      
      
      // Write some code here!

      // Always end your program with finch.quit()
     // myFinch.quit();
      //System.exit(0);
      }
   }

