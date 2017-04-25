/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;

/**
 *
 * @author Tim
 */
public class Buff {
    // TD - Instantiating and constructors created 
    private double multiplier;
    private String buffName;
    public Buff(){
        multiplier = 0;
        buffName = "";
    }
    public Buff(double multiplier, String buffName){
        this.multiplier = multiplier;
        this.buffName = buffName;
    }
    public double getMultiplier(){
        return multiplier;
    }
    public void setMultiplier(int multiplier){
        this.multiplier = multiplier;
    }
    public String getBuffName(){
        return buffName;
    }
    public void setBuffName(String buffName){
        this.buffName = buffName;
    }
   
    public String toString(){
        return buffName + " + " +  multiplier;
    }
    
}
