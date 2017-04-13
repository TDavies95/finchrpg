package Code.looping;
// Needs a package declaration to move to another folder

import Code.*;
import java.lang.Math;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * Created by: Tim Davies Date: 4/8/17
 * A starter file to use the Finch
 */

public class TiltedGame {

    public static int pickRandom() {
        int randDir = (int) ((Math.random() * 4) + 1);
        return randDir;
    }

    public static void main(final String[] args) {

        // Instantiating the Finch object
        Finch myFinch = new Finch();
        int score = 0;
        int q = 1;
        long t;
        long end;
        myFinch.saySomething("Let's get tilted.");
        myFinch.sleep(2000);
        /*
        myFinch.saySomething("Shake the finch for instructions. To begin, tilt up.",5000);
   
        while(q==0){
        if(myFinch.isShaken()){
            myFinch.saySomething("Green means to tilt up. Blue means to tilt down. Red means to tilt right. Yellow means to tilt left. Do so within four seconds, and return to level position.");
            myFinch.saySomething("Begin.");
            myFinch.sleep(12000);
            q = 1;
        }
        
        if(myFinch.isBeakDown()){
            myFinch.saySomething("Begin in a moment");
            myFinch.sleep(500);
            q=1;
        }
        }
        */
        while (q == 1) {

            int randDir = pickRandom();
            if (randDir == 1) {
                t = System.currentTimeMillis();
                end = t + 4000;
                myFinch.setLED(Color.WHITE);
                System.out.println("Up" + randDir);
                while (System.currentTimeMillis() < end) {

                    if (myFinch.isBeakUp()) {
                        score++;
                        myFinch.sleep(750);
                        break;
                    } else if (myFinch.isBeakDown() || myFinch.isRightWingDown() || myFinch.isLeftWingDown() || myFinch.isFinchUpsideDown()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    } else if (System.currentTimeMillis() - t >= 3900 && myFinch.isFinchLevel()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    }
                }
                System.out.println("Score: " + score);

            }
            if (randDir == 2) {
                t = System.currentTimeMillis();
                end = t + 4000;
                myFinch.setLED(Color.BLUE);
                System.out.println("Down" + randDir);
                while (System.currentTimeMillis() < end) {

                    if (myFinch.isBeakDown()) {
                        score++;
                        myFinch.sleep(750);
                        break;
                    } else if (myFinch.isFinchUpsideDown() || myFinch.isBeakUp() || myFinch.isLeftWingDown() || myFinch.isRightWingDown()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    } else if (System.currentTimeMillis() - t >= 3900 && myFinch.isFinchLevel()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    }

                }
                System.out.println("Score: " + score);

            }
            if (randDir == 3) {
                t = System.currentTimeMillis();
                end = t + 4000;
                myFinch.setLED(Color.RED);
                System.out.println("Right" + randDir);
                while (System.currentTimeMillis() < end) {

                    if (myFinch.isRightWingDown()) {
                        score++;
                        myFinch.sleep(750);
                        break;
                    } else if (myFinch.isBeakDown() || myFinch.isBeakUp() || myFinch.isLeftWingDown() || myFinch.isFinchUpsideDown()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    } else if (System.currentTimeMillis() - t >= 3900 && myFinch.isFinchLevel()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    }
                }
                System.out.println("Score: " + score);

            }
            if (randDir == 4) {
                t = System.currentTimeMillis();
                end = t + 4000;
                myFinch.setLED(Color.YELLOW);
                System.out.println("Left" + randDir);
                while (System.currentTimeMillis() < end) {

                    if (myFinch.isLeftWingDown()) {
                        score++;
                        myFinch.sleep(750);
                        break;
                    } else if (myFinch.isBeakDown() || myFinch.isBeakUp() || myFinch.isRightWingDown() || myFinch.isFinchUpsideDown()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    } else if (System.currentTimeMillis() - t >= 3900 && myFinch.isFinchLevel()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    }

                }
                System.out.println("Score: " + score);

            }
            if (randDir == 5) {
                t = System.currentTimeMillis();
                end = t + 4000;
                myFinch.setLED(Color.WHITE);
                System.out.println("Upside-down" + randDir);
                while (System.currentTimeMillis() < end) {

                    if (myFinch.isFinchUpsideDown()) {
                        score++;
                        myFinch.sleep(750);
                        break;
                    } else if (myFinch.isBeakDown() || myFinch.isBeakUp() || myFinch.isLeftWingDown() || myFinch.isRightWingDown()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    } else if (System.currentTimeMillis() - t >= 3900 && myFinch.isFinchLevel()) {
                        String finalScore = String.valueOf(score);
                        myFinch.saySomething("Final score: " + finalScore);
                        myFinch.sleep(2000);
                        score = 0;
                        System.exit(0);
                        myFinch.quit();
                    }
                }
                System.out.println("Score: " + score);
            }
        }

        System.exit(0);
        myFinch.quit();
    }
}
