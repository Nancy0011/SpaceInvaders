package model;

import dao.GameSettingsDAOText;
import java.io.Serializable;

/**
 * <p>
 * Title: Misc</p>
 * <p>
 * Description: </p>
 * <p>
 * Copyright: Copyright (c) 2005</p>
 * <p>
 * Company: TAFE SA</p>
 *
 * @author Santi Ruiz
 * @author Julie Ruiz
 * @author Jinghua Zhong
 * @version 1.0
 */
public class GameSettings implements Serializable {

//TODO add your code as in the signed-off Project Requirements document    
  
    
    //constants
    /**
     *
     */
    public static double MOVE_SPEED = 300;
    public static int FIRING_INTERVAL = 700;
    
    
        
    //instance variables
    private double moveSpeed;
    private int firingInterval;

    //no arg constructor

    /**
     *
     */

    public GameSettings(){
        this(MOVE_SPEED, FIRING_INTERVAL);
    }
    // all arg constructor

    /**
     *
     * @param moveSpeed
     * @param firingInterval
     */
    public GameSettings(double moveSpeed, int firingInterval) {
        this.moveSpeed = moveSpeed;
        this.firingInterval = firingInterval;
      
    }
   // get

    public double getMoveSpeed() {
        return moveSpeed;
    }

    /**
     *
     * @return
     */
    public int getFiringInterval() {
        return firingInterval;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    /**
     *
     * @param firingInterval
     */
    public void setFiringInterval(int firingInterval) {
        this.firingInterval = firingInterval;
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
        toStringBuilder.append("\nmoveSpeed= ");
        toStringBuilder.append(this.moveSpeed);
        toStringBuilder.append("\nfiringInterval= ");
        toStringBuilder.append(this.firingInterval);
        toStringBuilder.append("]");
        return toStringBuilder.toString();
    }
    
    // equals

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.moveSpeed) ^ (Double.doubleToLongBits(this.moveSpeed) >>> 32));
        hash = 71 * hash + this.firingInterval;
        return hash;

    }

    /**
     *
     * @param o
     * @return
     */
    
    @Override
      public boolean equals(Object o) {
        if (!(o instanceof GameSettings)) {
            return false;
        }
        GameSettings gameSettings = (GameSettings) o;
        
        
        return gameSettings.getFiringInterval()==(this.getFiringInterval()) 
            && gameSettings.getMoveSpeed()==(this.getMoveSpeed());
        
    }
    
    /**
    /**
     *
     * @param user
     * @throws Exception
     */
    public void saveData(UserDetails user) throws Exception {
        GameSettingsDAOText.saveData(user, this);//uncomment this once final version complete
    }

    /**
     *
     * @param user
     * @throws Exception
     */
    public void loadData(UserDetails user) throws Exception {
        GameSettingsDAOText.loadData(user, this);//uncomment this once final version complete
    }
}
