package Code.FRPG;

import java.util.ArrayList;

public class SkillBook {

    static ArrayList<String> sequence = new ArrayList<String>();
    static Skill[] sklbook = {new Skill(0, "Flail", "none"), new Skill(1, "Punch", "right"), new Skill(2, "Kick", "left"), new Skill(3, "Slam","down")};

    public static int getSkill() {
        Skill skl = getSeq();
        int id = skl.getID();
        int dmg = 0;
        switch (id) {
            case 0: {
                dmg = 1;
                break;
            }

            case 1: {
                dmg = 5;
                break;
            }
            case 2: {
                dmg = 4;
                break;
            }
            case 3: {
                dmg = 8;
                break;
            }

        }
        return dmg;
    }

    public static Skill getSeq() {
        String seq = "";
        while (true) {
            RPG.combatFinch.sleep(1000);
            if (RPG.combatFinch.isRightWingDown()) {
                sequence.add("right");
                System.out.println("right");
            }
            if (RPG.combatFinch.isLeftWingDown()) {
                sequence.add("left");
                System.out.println("left");
            }
            if (RPG.combatFinch.isBeakDown()) {
                sequence.add("down");
                System.out.println("down");
            }
            if (RPG.combatFinch.isBeakUp()) {
                break;
            }

        }
        for (int i = 0; i < sequence.size(); i++) {
            if(sequence.get(sequence.size()-1).equals("right")){
                return sklbook[1];
            }
            if(sequence.get(sequence.size()-1).equals("left")){
                return sklbook[2];
            }
            if(sequence.get(sequence.size()-1).equals("down")){
                return sklbook[3];
            }
        }
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

