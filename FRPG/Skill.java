package Code.FRPG;

public class Skill implements Typing{
    int id,statBoost,combatPower;
    private String typing;
    
    public boolean isType(Skill sk){
        if (sk.equals(typing)){
            return true;
        }
        return false;
    }
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
}
    
