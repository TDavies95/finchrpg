package Code.FRPG;

/**
 *
 * @author Tim
 */
public abstract class Player {

    /**
     * @return the inv
     */
    static int maxHealth = 200;
    public static int getMaxHealth(){
        return maxHealth;
    }
    public static void setMaxHealth(int h){
        maxHealth = h;
    }
    public Inventory getInv() {
        return inv;
    }

    /**
     * @param inv the inv to set
     */
    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    // TD - Instantiating and constructors created 
    private int health;
    private int mana;
    private static int combatPower;
    private static int level;
    private double luck;
    private double intel;
    private String myClass;
    private static int exp;
    private Inventory inv = new Inventory();
    int lvl = GUI.myPlayer.getLVL();
    private int toLVL;
    public Player() {
        health = mana = combatPower = exp = 0;
        luck = intel = 0;
        myClass = "";
        level = 1;
    }

    public Player(int h, int m, int c, int l, int i, int x, int lv, Inventory inv) {
        health = h;
        mana = m;
        combatPower = c;
        luck = l;
        intel = i;
        myClass = "";
        exp = x;
        level = lv;
        this.inv = inv;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public static void setCombatPower(int c) {
        combatPower = c;
    }

    public static int getCombatPower() {
        return combatPower;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public double getLuck() {
        return luck;
    }

    public void setIntel(double intel) {
        this.intel = intel;
    }

    public double getIntel() {
        return intel;
    }

    public void setEXP(int exp) {
        this.exp = exp;
    }

    public static  int getEXP() {
        return exp;
    }
    
    public static void levelUp(Player p) {
        int lvl = p.getLVL();
        int toLVL = (200*lvl+1000);
        if (p.getLVL() < 100) {
            if (p.getEXP() >= toLVL) {
                p.setMaxHealth(getMaxHealth()+10);
                p.setHealth(maxHealth);
                p.setCombatPower(getCombatPower()+1);
                p.setLVL(p.getLVL()+1);
                p.setEXP(0);
            }
            else{
                p.setLVL(p.getLVL());
            }
        }
    }
   

    public static int getLVL() {
        return level;
    }

    public void setLVL(int level) {
        this.level = level;
    }

    public void setClass(String myClass) {
        this.myClass = myClass;

    }

    public String getMyClass() {
        return myClass;
    }

    @Override
    public String toString() {
        return "Health: " + health + " Mana: " + mana + " CP: " + combatPower + " LVL: " + level + " Gold: " + inv.getItem(1).getQuantity();
    }

    /**
     * @return the toLVL
     */
    public int getToLVL() {
        return toLVL;
    }

    /**
     * @param toLVL the toLVL to set
     */
    public void setToLVL(int toLVL) {
        this.toLVL = toLVL;
    }
}
