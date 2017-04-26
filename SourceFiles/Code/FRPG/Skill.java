package Code.FRPG;

public class Skill implements Typing{
    int id,statBoost,combatPower;
    private String typing;
    private String name;

    @Override
    public void setType(String t){
        typing = t;
    }
    @Override
    public String getType(){
        return typing;
    }
    public Skill(){
        id = 0;
        name = "";
    }
    public Skill(int id){
     this.id = id;
    }
    public void setSkill(int id){
     this.id = id;   
    }
    public int getSkill(){
     return id;   
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean isType(Skill s){
        if (s.getType().equals(this.getType())){
            return true;
        }
        return false;
    }
}
    
