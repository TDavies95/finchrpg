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
    
public class Weapon extends Item {
    
    private int value; 
    private String name;
    private String quality;
    private String type;
    private int dmg;
    private boolean equippable;
    
    public Weapon(){
        value = dmg = 0;
        name = quality = type = "";
        equippable = true;
    }    
    public Weapon(int value, String name, String quality, String type, int damage, boolean equippable){
        this.value = value;
        this.name = name;
        this.quality = quality;
        this.type = type;
        this.equippable = equippable;
        damage = dmg;
    }    
    public boolean isEquippable(){
        return equippable;
    }
    /*
    public boolean isEquipped(){
        // needs interaction with the Inventory class
    }
    */
    public int getDmg(){
        return dmg;
    }
    public void setDmg(int damage){
        dmg = damage;
    }
    
}

