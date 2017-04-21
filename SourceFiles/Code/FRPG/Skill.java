package Code.FRPG;

public class Skill{
    int id,statBoost,combatPower;
    
    
    
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
    
