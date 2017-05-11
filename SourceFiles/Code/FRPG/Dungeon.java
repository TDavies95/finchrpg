package Code.FRPG;

import java.util.ArrayList;

public class Dungeon {

    public static Room r = new Room();
/*
    Ignore this monstrosity 
    
    public static Monster getMonsters(Room r) {

        ArrayList<Monster> listy = new ArrayList<Monster>();
        listy.add(r.mon[1]);
        if (r.mon[2] != null) {
            listy.add(r.mon[2]);
        }
        if (r.mon[3] != null) {
            listy.add(r.mon[3]);
        }
        if (r.mon[4] != null) {
            listy.add(r.mon[4]);
        }
        if (r.mon[5] != null) {
            listy.add(r.mon[5]);
        }
        
        if (listy.get(1).getHealth() >= 0) {
            listy.remove(1);
        }
        if (listy.get(2).getHealth() >= 0) {
            listy.remove(2);
        }
        if (listy.get(3).getHealth() >= 0) {
            listy.remove(3);
        }
        if (listy.get(4).getHealth() >= 0) {
            listy.remove(4);
        }
        if (listy.get(5).getHealth() >= 0) {
            listy.remove(5);
        }
        
        return r.getMon(5);
    }
*/
    public static Room getRoom(int id) {

        r.id = id;
        switch (id) {
            case 1:
                r.name = "Dungeon 1";
                r.mon[1] = new Monster(100, 5, 1500, "Goblin",null,null);
                r.mon[2] = new Monster(150, 8, 3000, "Skeleton",null,null);
                r.mon[3] = new Monster(200, 8, 3000, "Slime",null,null);
                r.mon[4] = new Monster(300, 5, 5000, "Ogre",null,null);
                r.mon[5] = new Monster(350, 8, 8000, "Elemental Spirit",null,null);
                break;
            case 2:
                r.name = "Dungeon 2";
                r.mon[1] = new Monster(500, 12, 85, "Cerberus",null,null);
                r.mon[2] = new Monster(700, 15, 100, "Banshee",null,null);
                break;
            case 3:
                r.name = "Dungeon 3";
                r.mon[1] = new Monster(800, 20, 120, "Hydra",null,null);
                r.mon[2] = new Monster(900, 20, 125, "Cyclops",null,null);
                break;
        }
        return r;
    }

}
