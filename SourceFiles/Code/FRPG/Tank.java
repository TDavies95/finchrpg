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
    private String type;
    private Tank tank;
    public Tank(){
        super(200,100,10,1,1);
    }
    public Tank(int h, int m, int c , int l, int i){
        super(h,m,c,l,i);
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
    
    public void setType(String type){
     this.type = type;   
    }
    public String getType(){
     return type;   
    }
    public boolean isType(String type){
        if(this.type.equals(type)){
         return true;   
        }
         return false;   
    }
    
    public String toString(){
        return "Health: " + health + " Mana: " + mana + " CP: " + combatPower;
    }
}
