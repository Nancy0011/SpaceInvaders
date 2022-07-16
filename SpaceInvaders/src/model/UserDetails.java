package model;


import dao.UserDetailsDAOText;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Objects;

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
public class UserDetails implements Serializable {

    //TODO add your code as in the signed-off Project Requirements document
    //constants

    /**
     *
     */
 
    public static final String DEFAULT_USERNAME = "NO NAME";

    /**
     *
     */
    public static final String DEFAULT_PASSWORD = null;

    /**
     *
     */
    public static final boolean DEFAULT_INFO = true;
    
    //instance variables
    private String userName;
    private String password;
    private boolean wantingIntroInfo;
    
    // no arg constructor

    /**
     *
     */
    public UserDetails() {
       this(DEFAULT_USERNAME, DEFAULT_PASSWORD);
    }
      
    //1 arg constructor

    /**
     *
     * @param userName
     */
    public UserDetails(String userName) {
        this(userName,DEFAULT_PASSWORD, DEFAULT_INFO);
     }
 
    /**
     *
     * @param userName
     * @param password
     */
    // 2 arg constructor
    public UserDetails(String userName, String password) {
        this(userName, password, DEFAULT_INFO);
     }
 
    /**
     *
     * @param userName
     * @param password
     * @param wantingIntroInfo
     */
        // all arg constructor
    public UserDetails(String userName, String password, boolean wantingIntroInfo) {
        this.userName = userName;
        this.password = password;
        this.wantingIntroInfo = wantingIntroInfo;
   }

    
    
    //getters

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isWantingIntroInfo() {
        return wantingIntroInfo;
    }
   //Setters

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWantingIntroInfo(boolean wantingIntroInfo) {
        this.wantingIntroInfo = wantingIntroInfo;
    }


   
        
    //to string

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append(super.toString());
        toStringBuilder.append("[");
        toStringBuilder.append("\nUserName= ");
        toStringBuilder.append(this.userName);
        toStringBuilder.append("\nPassword= ");
        toStringBuilder.append(this.password);
        toStringBuilder.append("\nWantingIntroInfo ");
        toStringBuilder.append(this.wantingIntroInfo);
        toStringBuilder.append("]");
        return toStringBuilder.toString();
    }

   
    /**
     *
     * @param o
     * @return
     */
    @Override
    //equals
    public boolean equals(Object o) {
        if (!(o instanceof UserDetails)) {
            return false;
        }
        UserDetails userDetails = (UserDetails) o;
        return userDetails.getUserName().equals(this.getUserName());
   
    }
     
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.userName);
        hash = 53 * hash + Objects.hashCode(this.password);
        hash = 53 * hash + (this.wantingIntroInfo ? 1 : 0);
        return hash;
    }

/**
     * saveData
     *
     * @throws SQLException
     */
    public void saveData() throws Exception {
        UserDetailsDAOText.saveData(this);
    }

    /**
     * loadData
     *
     * @throws SQLException
     */
    public void loadData() throws Exception {
        UserDetailsDAOText.loadData(this);
    }

}

