/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHarnesses;

import model.BorderEntity;
import model.GameDetails;
import model.GameSettings;
import model.UserDetails;

public class BorderEntityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BorderEntity b1 = null;
        BorderEntity b2;
        BorderEntity b3;
        BorderEntity b4;
        
        //TODO
        //Test no args constructors public BorderEntity() 
        
        b1 = new BorderEntity();
        System.out.println("/nno-arg constructor b1");
        System.out.println ("BorderEntity = " + b1);  
        System.out.println("------------------");         //read the results more clearly 

        //public BorderEntity(String id, int width, int height)
        b2 = new BorderEntity("AA00",60,70);
        System.out.println("\n constructor b2");
        System.out.println("BorderEntity = " + b2);
        System.out.println("------------------");         //read the results more clearly 

        //public BorderEntity(int initalXPos, int initialYPos, int width, int height)
        b3 = new BorderEntity(30,30,50,40);
        System.out.println("\n constructor b3");
        System.out.println("BorderEntity = " + b3);
        System.out.println("------------------");         //read the results more clearly 

        //Test all args constructor
        //public BorderEntity(String id, int initalXPos, int initialYPos, int width, int height)
        b4 = new BorderEntity("BB11",10,20,50,60);
        System.out.println("\nall-arg constructor");
        
        System.out.println("BorderEntity = " + b4);
        System.out.println("-----------------------------");         //read the results more clearly 


//        //test setters & getters
        System.out.println("\ntest setters & getters" );
        System.out.println("set width to 30");
        b3.setWidth(30);
        System.out.println("set height to 40");
        b3.setHeight(40);
        System.out.println("set id to Abc");
        b3.setId("Abc");
//        
//        //more info getters
        System.out.println("\nTest getters");
        System.out.println(b2.getWidth() + " " +
        b2.getHeight() + " " + 
        b2.getId());
        System.out.println("-----------------------------");         //read the results more clearly 
        
        
    }
}
  