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
    private int quantity;
    private int id;
    public Item(){
        value = 0;
        name = "";
        Buff buff = new Buff();
        stack = false;
        id = 0;
    }
    public Item(int v, Buff b, String n, boolean s, int i)
    {
        value = v;
        buff = b;
        name = n;
        stack = s;
        id = i;
    }
    public Item(String name, int id, int value, int quantity)
    {
        this.name = name;
        this.id = id;
        this.value = value;
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public int changeQ(int howmuch)
    {
        quantity = quantity+howmuch;
        return quantity;
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
    public int getID()
    {
        return id;
    }
    /*public int returnIDFromName(String name)
    {
        return id;
    }*/
    @Override
    public String toString(){
        return name + " Buff: " + buff + " Value: " + value + " X" + stack;
    }
    public void setStackable(boolean stack){
       this.stack = stack; 
    }
    public boolean getStackable(){
         return stack;
    }
    
}