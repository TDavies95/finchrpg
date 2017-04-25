package Code.FRPG;

public class Fighter extends Player{
    private int health;
    private int mana;
    private int combatPower;
    private int exp;
    private int level;
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
    }@Override
    
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
    public void setLVL(int level){
        this.level = level;
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
        return "Health: " + health + " Mana: " + mana + " CP: " + combatPower;
    }
}