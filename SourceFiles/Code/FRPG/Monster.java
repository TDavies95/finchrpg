
package Code.FRPG;

/**
 *
 * @author Tim
 */
public abstract class Monster implements Typing{
    // TD - Instantiating and constructors created 
    private int health;
    private int combatPower;
    private String name;
    public Monster(){
        health=combatPower=0;
    }
    public Monster(int h, int c){
        health = h;
        combatPower = c;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void setCombatPower(int combatPower){
        this.combatPower = combatPower;
    }
    public int getCombatPower(){
        return combatPower;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Name: " + name + " Health: " + health + " CP: " + combatPower;
    }
}