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
    private double luck;
    private double intel;
    private String myClass;
    private Tank tank;
    public Tank(){
        super(200,100,10,1,1);
    }
    public Tank(int h, int m, int c , int l, int i){
        super(h,m,c,l,i);
        myClass = "Tank";
    }
    public void setClass(){
     myClass = "Tank";   
    }
    public String getMyClass(){
     return "Tank";   
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
    
    public String toString(){
        return "Health: " + super.getHealth() + " Mana: " + super.getMana() + " CP: " + super.getCombatPower();
    }
}
