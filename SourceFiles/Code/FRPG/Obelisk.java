/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gryan
 */
public class Obelisk {

    private static int expReward;
    private static long time = System.currentTimeMillis();
    private static long end;
    private Random r = new Random();
    private String s = "";
    private String sM = "";

    public Obelisk() {
        expReward = 100;
        s = "leftleftleftleft";
    }

    public Obelisk(int expReward) {
        this.expReward = expReward;

        int q = r.nextInt((4) + 1);
        for(int i = 0; i<4;i++){
        if (q == 1) {
            s += "left";
          //  q = r.nextInt((4) + 1);
        }
        else if (q == 2) {
            s += "right";
           // q = r.nextInt((4) + 1);
        }
        else if (q == 3) {
            s += "up";
        //    q = r.nextInt((4) + 1);
        }
        else if (q == 4) {
            s += "down";
           // q = r.nextInt((4) + 1);
        }
        }

    }

    public int getOb() {
            System.out.println(s);
            end = time + 10000;
            time = System.currentTimeMillis();
        while (true) {
            
            GUI.combatFinch.sleep(900);
            if (GUI.combatFinch.isRightWingDown()) {
                sM += "right";
            }
            if (GUI.combatFinch.isLeftWingDown()) {
                sM += "left";
            }
            if (GUI.combatFinch.isBeakDown()) {
                sM += "down";
            }
            if (GUI.combatFinch.isBeakDown()) {
                sM += "up";
            }
            if (GUI.combatFinch.isFinchLevel()) {
                break;
            }
            System.out.println(sM);
        }
            if (s.equals(sM)&&time<end) {
                System.out.println("Correct");
                return expReward;
            }
            if (!s.equals(sM)&&time<end) {
                System.out.println("Failure");
                expReward = 0;
                return expReward;
            }
        expReward = 0;
        return expReward;
    }
}


