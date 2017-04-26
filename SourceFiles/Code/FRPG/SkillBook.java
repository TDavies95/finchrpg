

package Code.FRPG;
import java.util.ArrayList;

public class SkillBook {
   static ArrayList<String> sequence = new ArrayList<String>();
   static Skill[] sklbook = {new Skill(0,"Flail","none"),new Skill(1,"Punch","right"),new Skill(2,"Kick","left")};

    public static int getSkill() {
        Skill skl = getSeq();
        int id = skl.getID();
        int dmg = 0;
        switch (id) {
            case 0:
            {
                    dmg = 1;
                    break;
            }
                    
            case 1:
            {
              dmg = 5;
              break;
            }
          case 2:
          {
            dmg = 4;
            break;
          }
                

                }
         return dmg;
                }
    public static Skill  getSeq()
    {
      String seq = "";
      while(true)
      {
        if(RPG.combatFinch.isRightWingDown())
        {
          sequence.add("right");
        }
        if(RPG.combatFinch.isLeftWingDown())
        {
          sequence.add("left");
        }
        if(RPG.combatFinch.isBeakDown())
        {
          sequence.add("down");
        }
        if(RPG.combatFinch.isBeakUp())
        {
          break;
        }
        
      }
      for(int x = 0; x<sequence.size();x++)
      {
        seq+= sequence.get(x);
      }
      for(int i = 0; i<sklbook.length; i++)
      {
        if(sklbook[i].getSequence() == seq)
          return sklbook[i];
      }
      return sklbook[0];
      
    }
}
     
