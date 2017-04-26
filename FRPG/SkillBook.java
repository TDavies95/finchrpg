package Code.FRPG;

public class SkillBook {
   public static int turn = 1;
   
    public static int getSkill() {
        Skill skl = new Skill();
        int dmg = 0;
        
        
                while(turn!=1000){
                if (RPG.combatFinch.isRightWingDown()) {
                    skl.setName("Punch");
                    dmg = 5;
                    break;
                }
                if (RPG.combatFinch.isLeftWingDown()) {
                    skl.setName("Kick");
                    dmg = 4;
                    break;
                }
                if (RPG.combatFinch.isFinchUpsideDown()){
                    skl.setName("Flip");
                    dmg = 6;
                    break;
                }
                }
                return dmg;
            
    }
}
