
package Code.FRPG;

/**
 *
 * @author Tim
 */
public abstract class Player{
    // TD - Instantiating and constructors created 
    private int health;
    private int mana;
    private int combatPower;
    private double luck;
    private double intel;
    private String myClass;
    public Player(){
        health=mana=combatPower=0;
        luck=intel=0;
        myClass = "";
    }
    public Player(int h, int m, int c , int l, int i){
        health = h;
        mana = m;
        combatPower = c;
        luck = l;
        intel = i;
        myClass = "";
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    public int getMana(){
        return mana;
    }
    public void setCombatPower(int combatPower){
        this.combatPower = combatPower;
    }
    public int getCombatPower(){
        return combatPower;
    }
    public void setLuck(double luck){
        this.luck = luck;
    }
    public double getLuck(){
        return luck;
    }
    public void setIntel(double intel){
        this.intel = intel;
    }
    public double getIntel(){
        return intel;
    }
    public void buffPlayer(Buff buff, Item item){
        int preCP = combatPower;
        while(item.isEquiped()){ 
       combatPower = (int)(combatPower * buff.getMultiplier()); 
        }
        combatPower = preCP;
    }
    public void setClass(String myClass){
     this.myClass = myClass;   
        
    }
    public String getMyClass(){
     return myClass;   
    }
    public String toString(){
        return "Health: " + health + " Mana: " + mana + " CP: " + combatPower;
    }
}
