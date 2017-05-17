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
    private static int exp;
    private static int level;
    private double luck;
    private double intel;
    private String myClass;
   
    
    public Tank(){
        super(200,100,10,1,1,0,1,new Inventory());
        myClass = "Tank";
    }
    public Tank(int h, int m, int c , int l, int i,int x,int lv){
        super(h,m,c,l,i,x,lv,new Inventory());
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
        super.setHealth(health);
    }
    @Override
    public int getHealth(){
        return super.getHealth();
    }
    @Override
    public void setMana(int mana){
        super.setMana(mana);
    }
    @Override
    public int getMana(){
        return super.getMana();
    }
    @Override
    public void setCombatPower(int combatPower){
        super.setCombatPower(combatPower);
    }
    @Override
    public int getCombatPower(){
        return super.getCombatPower();
    }
    @Override
    public void setLuck(double luck){
        super.setLuck(luck);
    }
    @Override
    public double getLuck(){
        return super.getLuck();
    }
    @Override
    public void setIntel(double intel){
        super.setIntel(intel);
    }
    @Override
    public double getIntel(){
        return super.getIntel();
    }
    @Override
    public void setEXP(int exp){
        super.setEXP(exp);
    }
    /*
    @Override
    public int getEXP(){
        return super.getEXP();
    }
    @Override
    public void levelUp(){
        level++;
    }
    @Override
    public int getLVL(){
        return super.getLVL();
    }
*/
    @Override
    public void setLVL(int level){
        super.setLVL(level);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
