package Code.FRPG;

import java.util.ArrayList;

public class SkillBook {

    static ArrayList<String> sequence = new ArrayList<String>();
    static Skill[] sklbook = {new Skill(0, "Flail", "none"), new Skill(1, "Punch", "right"), new Skill(2, "Kick", "left"), new Skill(3, "Slam", "down"),new Skill(4,"Heal","up")};

    public static int getSkill() {
        Skill skl = getSeq();
        int id = skl.getID();
        int dmg = 0;
        switch (id) {
            case 0: {
                dmg = 0 * GUI.myPlayer.getCombatPower();
                break;
            }

            case 1: {
                dmg = 1*GUI.myPlayer.getCombatPower();;
                break;
            }
            case 2: {
                dmg = (int) 1.5 *GUI.myPlayer.getCombatPower();
                break;
            }
            case 3: {
                dmg = 2 * (int) 1.5 *GUI.myPlayer.getCombatPower();
                break;
            }
            case 4: {
                
                GUI.myPlayer.setHealth(GUI.myPlayer.getHealth()+10);
                
                
            }

        }
        return dmg;
    }

    public static Skill getSeq() {
        String seq = "";
        while (true) {
            GUI.combatFinch.sleep(750);
            if (GUI.combatFinch.isRightWingDown()) {
                sequence.add("right");
                System.out.println("Punch");
            }
            if (GUI.combatFinch.isLeftWingDown()) {
                sequence.add("left");
                System.out.println("Kick");
            }
            if (GUI.combatFinch.isBeakDown()) {
                sequence.add("down");
                System.out.println("Slam");
            }
            if (GUI.combatFinch.isBeakUp()) {
                sequence.add("up");
                System.out.println("potion");
            }
            if (GUI.combatFinch.isFinchLevel()) {
                break;
            }

        }
        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(sequence.size() - 1).equals("right")) {
                sequence.clear();
                return sklbook[1];
            }
            if (sequence.get(sequence.size() - 1).equals("left")) {
                sequence.clear();
                return sklbook[2];
            }
            if (sequence.get(sequence.size() - 1).equals("down")) {
                sequence.clear();
                return sklbook[3];
            }
        }
        sequence.clear();
        return sklbook[0];
    }
    /*
      for(int x = 0; x<sequence.size();x++)
      {
        seq+= sequence.get(x);
      }
      for(int i = 0; i<sklbook.length; i++)
      {
        if(sklbook[i].getSequence().equals(seq))
          return sklbook[i];
      }
      return sklbook[0];
     */
}
