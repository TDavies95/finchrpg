/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 *
 * @author Tim
 */
public class RPGClient {
    // TD - Instantiating and constructors created 
    public static void main(final String [] args){
        Finch myFinch = new Finch();
        Tank myPlayer = new Tank(200,100,5,1,1);
       
        myFinch.quit();
        System.exit(0);
        
    }
}
