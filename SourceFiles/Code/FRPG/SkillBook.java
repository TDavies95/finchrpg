package Code.FRPG;

public class SkillBook {
   public static int turn = 1;
   
    public static int getSkill(int id) {
        Skill skl = new Skill();
        int dmg = 0;
        
            switch(id){
                case 1:
                if (RPG.combatFinch.isRightWingDown()) {
                    skl.setName("Punch");
                    dmg = 5;
                    break;
                }
                case 2:
                if (RPG.combatFinch.isLeftWingDown()) {
                    skl.setName("Kick");
                    dmg = 4;
                    break;
                }
                case 3:
                if (RPG.combatFinch.isFinchUpsideDown()){
                    skl.setName("Flip");
                    dmg = 6;
                    break;
                }
                }
                return dmg;
    }
}
