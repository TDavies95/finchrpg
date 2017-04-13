
package Code.looping;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Boppit {
 public static void main(final String[] args)
   {
   // Instantiating the Finch object
      Finch myFinch = new Finch();

      //This program will select a random number betweeen 0 and 3 (or 1 and 4)
      //Each random number will be associated with a direction to turn the Finch robot
      //Everytime you tilt the robot the proper direction, increment a score
      //When you tilt the wrong direction, the game will end and score output.
      //For an actual game make the directions associated with an LED color 
      // (this way you'll be less likely to get the proper directions)
     
      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
    }
}