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
        s = "leftleftleft";
    }

    public Obelisk(int expReward) {
        Thread thread = new Thread();
        thread.start();
        try{
        this.expReward = expReward;
        int q = 3;
        for (int i = 0; i < 3; i++) {
            thread.sleep(100);
            switch (q) {

                case 1:
                    s += "left";
                    q = r.nextInt((3) + 1);
                    break;
                case 2:
                    s += "right";
                    q = r.nextInt((3) + 1);
                    break;
                case 3:
                    s += "down";
                    q = r.nextInt((3) + 1);
                    break;
                
            }
         }
        }catch(Exception ex){
        System.out.println("Oops");
    }
    }

    

    public int getOb() {
        System.out.println(s);
        end = time + 10000;
        time = System.currentTimeMillis();
        GUI.combatFinch.sleep(500);
        while (true) {

            GUI.combatFinch.sleep(900);
            if (GUI.combatFinch.isRightWingDown()) {
                sM += "right";
            } else if (GUI.combatFinch.isLeftWingDown()) {
                sM += "left";
            } else if (GUI.combatFinch.isBeakDown()) {
                sM += "down";
            }  else if (GUI.combatFinch.isFinchLevel()) {
                break;
            }
            System.out.println(sM);
        }
        if (s.equals(sM) && time < end) {
            System.out.println("Correct");
            return expReward;
        }
        if (!s.equals(sM) && time < end) {
            System.out.println("Failure");
            expReward = 0;
            return expReward;
        }
        expReward = 0;
        return expReward;
    }
}
