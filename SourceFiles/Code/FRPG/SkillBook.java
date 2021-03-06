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
                ItemBook.itembook[0].changeQ(-1);
                break;
                
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
                GUI.jTextArea1.setText("Slash");
                GUI.jTextArea1.update(GUI.jTextArea1.getGraphics());
            }
            if (GUI.combatFinch.isLeftWingDown()) {
                sequence.add("left");
                GUI.jTextArea1.setText("Sweep");
                GUI.jTextArea1.update(GUI.jTextArea1.getGraphics());
            }
            if (GUI.combatFinch.isBeakDown()) {
                sequence.add("down");
                GUI.jTextArea1.setText("Jab");
                GUI.jTextArea1.update(GUI.jTextArea1.getGraphics());
            }
            if (GUI.combatFinch.isBeakUp()) {
                sequence.add("up");
                int currHP = GUI.myPlayer.getHealth();
                while(sequence.equals("up")){
                if(ItemBook.getItem(0).getQuantity()>0 && GUI.myPlayer.getHealth() < GUI.myPlayer.maxHealth){
                    
                    if(GUI.myPlayer.getHealth() > GUI.myPlayer.maxHealth){
                        GUI.myPlayer.setHealth(GUI.myPlayer.maxHealth);
                    }
                    
                }else{
                    System.out.println("You're out of potions.");
                }
                }
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
            if (sequence.get(sequence.size() - 1).equals("up")) {
                sequence.clear();
                return sklbook[4];
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
