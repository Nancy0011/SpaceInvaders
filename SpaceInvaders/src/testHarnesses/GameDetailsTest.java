/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHarnesses;

import java.sql.SQLException;
import model.GameDetails;
import model.GameSettings;
import model.UserDetails;

/**
 *
 * @author z
 */
public class GameDetailsTest {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, Exception {
        GameDetails g1;
        GameDetails g2;
        GameDetails g3;
    
        //test no arg constructor gameDetails()
        g1 = new GameDetails();
        //test all args constructor GameDetails(UserDetails user, GameSettings gameSettings)
        //need to firstly create a userDetails1 and gameSettings1
        UserDetails userDetails1 = new UserDetails("AA","09098700");
        GameSettings gameSettings1 = new GameSettings(500.0, 700);
        g2 = new GameDetails(userDetails1, gameSettings1);
        //no arg constructor
        System.out.println("no-arg constructor");
        System.out.println("GameDetails g1 = " + g1);
        System.out.println("-----------------------------");         //read the results more clearly 
        //all args constructor g2
        System.out.println("\nall args constructor g2");
        System.out.println("GameDetails g2 = " + g2);
        System.out.println("-----------------------------");         //read the results more clearly 
        //another all args constructor g3
        //create another userDetails2 and gameSettings2
        UserDetails userDetails2 = new UserDetails("BB","01010101");
        GameSettings gameSettings2 = new GameSettings(300.0, 500);
        g3 = new GameDetails(userDetails2, gameSettings2);
        System.out.println("\nall args constructor g3");
        System.out.println("GameDetails g3 = " + g3);
        System.out.println("-----------------------------");         //read the results more clearly 
        
        //test setters & getters
        System.out.println("\ntest setters & getters" );
        //sample setters & getters
        System.out.println("set score to 100" );
        g1.setShotsFired(50);
        System.out.println("g1 ShotsFired from getter:" + g1.getShotsFired());
        System.out.println("-------------"); 
        //more info in setters
        System.out.println("\nTest setters");
        g1.setUserDetails(userDetails1);
        g1.setGameSettings(gameSettings1);
        g1.setHighScore(20);
        g1.setScore(50);
        g1.setShipsDestroyed(90);
        g1.setShotsFired(100);
        g1.setNewHighScore(false);
        System.out.println("GameDetails g1 = " + g1);
        System.out.println("-------------");         
        //more info in getters
        System.out.println("\nTest getters");
        System.out.println(g2.getUserDetails() + " "+
            g2.getGameSettings() + " " +
            g2.getHighScore() + " " +
            g2.getScore() + " " +
            g2.getShipsDestroyed() + " " +
            g2.getShotsFired() + " ");
        System.out.println("-----------------------------");         //read the results more clearly 
        
        // test equals
        System.out.print("\ng1 and g2 are equal. True or False? = ");
        System.out.println(g1.equals(g2));
        System.out.print("g2 and g3 are equal. True or False? = ");
        System.out.println(g2.equals(g3));
    }
}
    
 
    