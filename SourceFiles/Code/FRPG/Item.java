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
    private int quantity;
    private String name;
    private Buff buff;
    private boolean isEquipable;
    private boolean stack;
    
    public Item(){
        value = 0;
        name = "";
        Buff buff = new Buff();
        isEquipable = false;
        quantity = 1;
    }
    public Item(int value, int quanitity, Buff buff, String name,boolean isEquipable){
        this.value = value;
        this.buff = buff;
        this.name = name;
        this.isEquipable = isEquipable;
        this.quantity = quantity;
    }
    public Item(int value, int quantity, String name,boolean isEquipable){
        this.value = value;
        this.name = name;
        this.isEquipable = isEquipable;
        this.quantity = quantity;
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
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(){
        this.quantity = quantity;
    }
    public void setEquipable(){
        isEquipable = true;  
    }
    public void setUnequipable(){
        isEquipable = false;
    }
    public void oneStack(){
        quantity = 1;
    }
    public void addStack(){
        if (quantity<64)
        quantity++;
    }
    public void removeStack(){
        if (quantity>0)
            quantity--;
    }
    public void fullStack(){
        quantity = 64;
    }
    @Override
    public String toString(){
        return name;
    }
    
}
