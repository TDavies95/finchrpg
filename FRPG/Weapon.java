/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;

/**
 *
 * @author 49037
 */
public class Weapon extends Item {
    
    private int value; 
    private String name;
    private Buff buff;
    private String quality;
    private String type;
    private int dmg;
    private boolean equippable;
    
    public Weapon(int value, String name, String quality, String type, int damage){
        this.value = value;
        this.name = name;
        this.quality = quality;
        this.type = type;
        equippable = true;
        dmg = damage;
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

