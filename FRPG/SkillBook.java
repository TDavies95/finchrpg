package Code.FRPG;

public class SkillBook {

    public static int getSkill(int id) {
        Skill skl = new Skill();
        skl.id = id;
        int dmg = 0;
        switch (id) {
            case 1:
                    while(true){
                    if (RPG.combatFinch.isRightWingDown()) {
                        dmg = 5;
                        break;
                    }
                    }
            case 2:
                while(true){
                if (RPG.combatFinch.isLeftWingDown()) {
                    dmg = 4;
                    break;

                }
                }
                
        }
        return dmg;
    }
}
     

