
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
    private int level;
    private double luck;
    private double intel;
    private String myClass;
    private int exp;
    
    public Player(){
        health=mana=combatPower=exp=0;
        luck=intel=0;
        myClass = "";
        level = 1;
    }
    public Player(int h, int m, int c , int l, int i,int x,int lv){
        health = h;
        mana = m;
        combatPower = c;
        luck = l;
        intel = i;
        myClass = "";
        exp = x;
        level = lv;
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
    public void setEXP(int exp){
        this.exp = exp;
    }
    public int getEXP(){
        return exp;
    }
    public void levelUp(){
        level++;
    }
    public int getLVL(){
        return level;
    }
    public void setLVL(int level){
        this.level = level;
    }
    public void setClass(String myClass){
     this.myClass = myClass;   
        
    }
    public String getMyClass(){
     return myClass;   
    }
    @Override
    public String toString(){
        return "Health: " + health + " Mana: " + mana + " CP: " + combatPower;
    }
}
