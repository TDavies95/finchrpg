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
public class Item {
    // TD - Instantiating and constructors created 
    private int value;
    private String name;
    private Buff buff;
    public Item(){
        value = 0;
        name = "";
        Buff buff = new Buff();
    }
    public Item(int value, Buff buff, String name){
        this.value = value;
        this.buff = buff;
        this.name = name;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public Buff getBuff(){
        return buff;
    }
    public void setBuff(Buff buff){
        this.buff = buff;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isEquiped(){
        return true;
    }
    public String toString(){
        return name;
    }
    
}
