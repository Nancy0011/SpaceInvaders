package testHarnesses;

import model.UserDetails;

/**
 * <p>
 * Title: Misc</p>
 * <p>
 * Description: </p>
 * <p>
 * Copyright: Copyright (c) 2006</p>
 * <p>
 * Company: TAFE SA</p>
 *
 * @author Santi Ruiz
 * @author Julie Ruiz 
 * @version 2.0
 * @author Jinghua Zhong
 */

public class UserDetailsTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //TODO
      
        UserDetails u;
        UserDetails u1;
        UserDetails u2;
        UserDetails u3;
        
        // Test no-arg constructor
        System.out.println("\nTest no-arg constructor");
        u = new UserDetails();
        System.out.println(u);
        //or
        System.out.println("UserDetails "+u);//test to string
        
        // Test 1 arg constructor
        System.out.println("\nTest 4-arg constructor values");
        u1 = new UserDetails("Jane");
        System.out.println(u1);
        //or
        System.out.println("UserDetails "+u1);//test to string

        // Test 2 arg constructor
        System.out.println("\nTest all-arg constructor values");
        u2 = new UserDetails("John", "2323jijk");
        System.out.println(u2);
        //or
        System.out.println("HserDetails "+u2);//test to string
        
        // Test all arg constructor
        System.out.println("\nTest all-arg constructor values");
        u3 = new UserDetails("John", "2323jijk", true);
        System.out.println(u3);
        //or
        System.out.println("UserDetails "+u3);//test to string
        
        // Test getters
        System.out.println("\nTest getters");
        System.out.println(u.getUserName() + " " +
                u.getPassword() + " " +
                u.isWantingIntroInfo());
        System.out.println(u3.getUserName() + " " +
                u3.getPassword() + " " +
                u3.isWantingIntroInfo());

        // Test setters 
        System.out.println("\nTest setters");
        u.setUserName("David");
        u.setPassword("aaa9890");
        u.setWantingIntroInfo(false);
        System.out.println(u);
        //or
        System.out.println("UserDetails: "+u);
        
        // Test equals
        System.out.println("\nTest equals");
        System.out.println("u = u1" + "  " + u.equals(u1));
        System.out.println("u2 = u3" + "  " + u2.equals(u3));
        
    }
}
