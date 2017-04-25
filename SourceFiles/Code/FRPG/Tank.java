package Code.FRPG;

/**
 *
 * @author Tim
 */
public class Tank extends Player{
    // TD - Instantiating and constructors created 
    private int health;
    private int mana;
    private int combatPower;
    private int exp;
    private int level;
    private double luck;
    private double intel;
    private String myClass;
    
    public Tank(){
        super(200,100,10,1,1,0,1);
        myClass = "Tank";
    }
    public Tank(int h, int m, int c , int l, int i,int x,int lv){
        super(h,m,c,l,i,x,lv);
        myClass = "Tank";
    }
    public void setClass(){
     myClass = "Tank";   
    }
    @Override
    public String getMyClass(){
     return "Tank";   
    }
    @Override
    public void setHealth(int health){
        this.health = health;
    }
    @Override
    public int getHealth(){
        return health;
    }
    @Override
    public void setMana(int mana){
        this.mana = mana;
    }
    @Override
    public int getMana(){
        return mana;
    }
    @Override
    public void setCombatPower(int combatPower){
        this.combatPower = combatPower;
    }
    @Override
    public int getCombatPower(){
        return combatPower;
    }
    @Override
    public void setLuck(double luck){
        this.luck = luck;
    }
    @Override
    public double getLuck(){
        return luck;
    }
    @Override
    public void setIntel(double intel){
        this.intel = intel;
    }
    @Override
    public double getIntel(){
        return intel;
    }
    @Override
    public void setEXP(int exp){
        this.exp = exp;
    }
    @Override
    public int getEXP(){
        return exp;
    }
    @Override
    public void levelUp(){
        level++;
    }
    @Override
    public int getLVL(){
        return level;
    }
    @Override
    public String toString(){
        return "Health: " + super.getHealth() + " Mana: " + super.getMana() + " CP: " + super.getCombatPower();
    }
}
