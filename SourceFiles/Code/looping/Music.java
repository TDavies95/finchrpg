package Code.looping;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Music{
    
    public static void main(final String [] args){
        
        Finch myFinch = new Finch();
        while(true){
        if (myFinch.isBeakDown()){
         myFinch.buzz(65,200);   
        }
        if (myFinch.isBeakUp()){
         myFinch.buzz(73,200);   
        }
        if (myFinch.isLeftWingDown()){
         myFinch.buzz(82,200);   
        }
        if (myFinch.isRightWingDown()){
         myFinch.buzz(87,200);   
        }
    }
        
        //myFinch.quit();
       // System.exit(0);
    }    
}