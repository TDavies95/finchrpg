package Code.looping;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class Pitch
   {
   public static void main(final String[] args)
      {
       
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      int x = 0;
      int f = 0;   
      //IF finch tilted up, change pitch
      //If finch tilted down, lower pitch
      while ( x == 0){
          
          while(myFinch.isBeakUp()){
              f++;
              myFinch.buzz(f,100);  
          }
          while(myFinch.isBeakDown()){
              if(f>0){
           f-=5;
           myFinch.buzz(f,100);  
              }
          }
          
      }
                       
                   
      
      
      // Write some code here!

      // Always end your program with finch.quit()
      //myFinch.quit();
      //System.exit(0);
      }
   }

