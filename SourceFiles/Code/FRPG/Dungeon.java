package Code.FRPG;

import javax.swing.ImageIcon;

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
                r.mon[1] = new Monster(100, 4, 200, "Goblin",null,10, "/Code/FRPG/images/monster1.png");
                r.mon[2] = new Monster(150, 5, 300, "Skeleton",null,20,"/Code/FRPG/images/monster2.png");
                r.mon[3] = new Monster(200, 6, 500, "Slime",null,25,"/Code/FRPG/images/monster3.png");
                r.mon[4] = new Monster(300, 8, 500, "Ogre",null,30,"/Code/FRPG/images/monster4.png");
                r.mon[5] = new Monster(350, 10, 800, "Troll Warlord",null,50, "A grumbling sound approaches. A Troll Warlord stumbles into view...","/Code/FRPG/images/monster5.png");
                break;
            case 2:
                r.name = "Dungeon 2";
                r.mon[1] = new Monster(50, 12, 85, "Scarab Swarm",null,40,"/Code/FRPG/images/monster10.png");
                r.mon[2] = new Monster(300, 12, 100, "Mummy",null,60,"/Code/FRPG/images/monster10.png");
                r.mon[3] = new Monster(350, 9,100, "Animated Sarcophagus",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[4] = new Monster(400,12,100, "Sphinx",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[5] = new Monster(500,15,100, "Anubis Statue",null,120, "A grumbling sound approaches. An Anubis Statue stumbles into view...","/Code/FRPG/images/monster11.png");
                break;
            case 3:
                r.name = "Dungeon 3";
                r.mon[1] = new Monster(450, 18, 105, "Hellhound",null,75,"/Code/FRPG/images/monster10.png");
                r.mon[2] = new Monster(600, 20, 120, "Firebrand",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[3] = new Monster(300, 25, 120, "Charon",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[4] = new Monster(650, 20, 150,"Cerberus",null,130,"/Code/FRPG/images/monster10.png");
                r.mon[5] = new Monster(800, 25, 200, "Hades", null, 250, "A grumbling sound approaches. Hades stumbles into view...","/Code/FRPG/images/monster10.png");
                break;
            case 4:
                r.name = "Dungeon 4";
                r.mon[1] = new Monster(450, 18, 105, "Stone Golem",null,75,"/Code/FRPG/images/monster10.png");
                r.mon[2] = new Monster(600, 20, 120, "Rock Monster",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[3] = new Monster(300, 25, 120, "Flame Wizard",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[4] = new Monster(650, 20, 150,"Mountain Troll",null,130,"/Code/FRPG/images/monster10.png");
                r.mon[5] = new Monster(800, 25, 200, "Hyperion", null, 250, "A grumbling sound approaches. Hyperion stumbles into view...","/Code/FRPG/images/monster10.png");
                break;    
            case 5:
                r.name = "Dungeon 5";
                r.mon[1] = new Monster(450, 18, 105, "Spydex 0xBB8",null,75,"/Code/FRPG/images/monster10.png");
                r.mon[2] = new Monster(600, 20, 120, "Hackecopter",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[3] = new Monster(300, 25, 120, "Voltron",null,100,"/Code/FRPG/images/monster10.png");
                r.mon[4] = new Monster(650, 20, 150,"Sparktron",null,130,"/Code/FRPG/images/monster10.png");
                r.mon[5] = new Monster(800, 25, 200, "Puppet Master", null, 250, "A grumbling sound approaches. A Puppet Master stumbles into view...","/Code/FRPG/images/monster10.png");
                break;
        }
        return r;
    }

}
