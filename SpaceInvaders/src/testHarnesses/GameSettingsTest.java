
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHarnesses;

import model.GameSettings;

/**
 *
 * @author z
 */
public class GameSettingsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //TODO
        
        // Test no arg GameSettings()
        GameSettings g = new GameSettings();
        System.out.println("No-arg g:\n"+g);
        
        // test 2-arg public GameSettings(int moveSpeed, int firingInterval)
        GameSettings g2 = new GameSettings(300.0,600);
        System.out.println("2-arg g2:\n" + g2);

        // Test all arg public GameSettings(int moveSpeed, int firingInterval)
        GameSettings g3 = new GameSettings(300.0,600);
        System.out.println("All-arg g3:\n" + g3);
        
         // Test getters
        System.out.println("Test setters/getters:");
        System.out.println("MoveSpeed = " + g.getMoveSpeed() + " FiringInterva = " + g.getFiringInterval());

        // test setters
        g.setMoveSpeed(500.0);
        g.setFiringInterval(500);
      
        //equals
        System.out.print("g and g2 are equal. True or False? = ");
        System.out.println(g.equals(g2));
        System.out.print("g2 and g3 are equal. True or False? = ");
        System.out.println(g2.equals(g3));
    }
}    