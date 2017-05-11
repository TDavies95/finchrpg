package Code.FRPG;

public class Fighter extends Player{
    private int health;
    private int mana;
    private int combatPower;
    private static int exp;
    private static int level;
    private double luck;
    private double intel;
    private String type;
    private String myClass;
    
    public Fighter(){
        super(100,75,20,5,1,0,1);
        myClass = "Fighter";
    }
    public Fighter(int h, int m, int c , int l, int i,int x,int lv){
        super(h,m,c,l,i,x,lv);
        myClass = "Fighter";
    }
    public void setClass(){
     myClass = "Fighter";   
    }
    @Override
    public String getMyClass(){
     return "Fighter";   
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
        super.setLVL(level+1);
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
    @Override
    public String toString(){
        return "Health: " + super.getHealth() + " Mana: " + super.getMana() + " CP: " + super.getCombatPower();
    }
}