
package Code.FRPG;

/**
 *
 * @author Tim
 */
public class Monster{
    // TD - Instantiating and constructors created 
    private int health;
    private int combatPower;
    private int expReward;
    private String name;
    private Item drop;
    private Item gold;
    
    public boolean isAlive(){
        if(health==0)
            return false;
        return true; 
    }
    public void death(){
        combatPower = 0;
    }
    public Monster(){
        health=combatPower=expReward=0;
    }
    public Monster(int h, int c,int x, String name,Item drop, Item goldReward){
        health = h;
        combatPower = c;
        this.name = name;
        expReward = x;
        this.drop = drop;
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
    public void setEXP(int x){
        expReward = x;
    }
    public int getEXP(){
        return expReward;
    }
    public void setDrop(Item drop){
        this.drop = drop;
    }
    public Item getDrop(){
        return drop;
    }
    public void setGold(Item gold){
        this.gold = gold;
    }
    public Item getGold(){
        return gold;
    }
    public Monster createMonster(){
        
     return new Monster(100,20,0,"Monster",null,null);
        
    } 
    @Override
    public String toString(){
        return "Name: " + name + " Health: " + health + " CP: " + combatPower;
    }
}