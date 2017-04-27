package Code.FRPG;

/**
 *
 * @author Tim
 */
public abstract class Companion implements Typing{
    // TD - Instantiating and constructors created 
    private int health;
    private int combatPower;
    private String name;
    private int mana;
    public Companion(){
        health=combatPower=mana=0;
    }
    public Companion(int h, int c){
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
     public void setMana(int mana){
        this.mana = mana;
    }
    public int getMana(){
        return mana;
    }
   
    // thought a companion can have one spell 
    // such as one will heal or another will give a power boost.
    // Outside of that they will be similar to monsters, but will have a set number of mana as the maximum.. 
    // We can defeat a monster and translate it into aa companion if that would add ore depth to the game.
    // probably have only two companions that can be replaced by a defeated enemy.
    
   // public void setSpell(Spell spell){
    //    this.spell = spell;
   // }
   // public Skill getSpell(){
    //    return spell;
   /// }
    // When the spell book is done i would have each companion have one spell they can use to help the player/
    public String toString(){
        return "Name: " + name + " Health: " + health + " CP: " + combatPower + "Mana: " + mana;
    }
}