package Code.FRPG;

/**
 *
 * @author Tim
 */
public class Item {
    // TD - Instantiating and constructors created 
    private int value;
    private String name;
    private Buff buff;
    private boolean stack;
    public Item(){
        value = 0;
        name = "";
        Buff buff = new Buff();
        stack = false;
    }
    public Item(int value, Buff buff, String name, boolean stack){
        this.value = value;
        this.buff = buff;
        this.name = name;
        this.stack = stack;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public Buff getBuff(){
        return buff;
    }
    public void setBuff(Buff buff){
        this.buff = buff;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isEquiped(){
        return true;
    }
    public String toString(){
        return name;
    }
    public void setStackable(boolean stack){
       this.stack = stack; 
    }
    public boolean getStackable(){
         return stack;
    }
    
}