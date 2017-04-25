package Code.FRPG;

public class Dungeon{
 public static Room getRoom(int id) {
        Room r = new Room();
        r.id = id;
        switch(id) {
            case 1:
                r.name = "Dungeon 1";
                r.mon[1] = new Monster(100,5,20,"Goblin");
                r.mon[2] = new Monster(150,8,30,"Skeleton");
                r.mon[3] = new Monster(200,8,30,"Slime");
                r.mon[4] = new Monster(300,5,50,"Ogre");
                r.mon[5] = new Monster(350,8,80,"Elemental Spirit");
                break;
            case 2:
                r.name = "Dungeon 2";
                r.mon[1] = new Monster(500,12,85,"Cerberus");
                r.mon[2] = new Monster(700,15,100,"Banshee");
                break;
            case 3:
                r.name = "Dungeon 3";
                r.mon[1] = new Monster(800,20,120,"Hydra");
                r.mon[2] = new Monster(900,20,125,"Cyclops");
                break;
        }
        return r;
    }    
    
 }
 