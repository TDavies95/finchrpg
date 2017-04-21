package Code.FRPG;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class SkillBook{
    public static Skill getSkill(int id) {
        Skill skl = new Skill();
        skl.id = id;
        Finch finch = new Finch();
        if (id == 0) {
           skl.statBoost = 2;
            
        } else if (id == 1) {
           
            
        }
    return null;
    
    }
}