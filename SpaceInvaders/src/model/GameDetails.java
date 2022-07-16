package model;

import dao.GameDetailsDAOText;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Objects;

/**
 * <p>
 * The details for one game, including the user playing, the game settings the scoring (shots fired, ships destroyed,
 * score and previous high score)
 * </p>
 * <p>
 * Company: TAFE SA</p>
 *
 * @author Santi Ruiz
 * @author Julie Ruiz 
 * @author Jinghua Zhong
 * @version 1.0 Initial version
 * @version 2.0 Updated to improve setting of highscore
 */
public class GameDetails implements Serializable {

    //constants

    /**
     *
     */
    public static final int POINTS_GAINED_FOR_SHIP_DESTROYED = 100;

    /**
     *
     */
    public static final int POINTS_LOST_FOR_WASTED_SHOT = 50;
   

    //instance variables
    private UserDetails userDetails;
    private GameSettings gameSettings;
    private int highScore;
    private int score;
    private int shipsDestroyed;
    private int shotsFired;
    private boolean newHighScore;

    

    //only 2 constructors required
    /**
     * UserDetails
     *
     * @throws java.lang.Exception
     */
    //no args constructor
    
      public GameDetails() throws Exception {
        //TODO
        this(new UserDetails(), new GameSettings());

    }
 
    //all args constructor

    /**
     *
     * @param user
     * @param gameSettings
     * @throws Exception
     */
    public GameDetails(UserDetails user, GameSettings gameSettings) throws Exception {
         //TODO
        this.userDetails = user;
        this.gameSettings = gameSettings;
        resetTheScoringDetails();
    }

    //getters and setters

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public GameSettings getGameSettings() {
        return gameSettings;
    }

    public int getHighScore() {
        return highScore;
    }

    public int getScore() {
        return score;
    }

    public int getShipsDestroyed() {
        return shipsDestroyed;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public boolean isNewHighScore() {
        return newHighScore;
    }
    //Setters

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public void setGameSettings(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setShipsDestroyed(int shipsDestroyed) {
        this.shipsDestroyed = shipsDestroyed;
    }

    public void setShotsFired(int shotsFired) {
        this.shotsFired = shotsFired;
    }

    public void setNewHighScore(boolean newHighScore) {
        this.newHighScore = newHighScore;
    }
    
    
    //toString method
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append(super.toString());
        toStringBuilder.append("[");
        toStringBuilder.append("\nuserDetails= ");
        toStringBuilder.append(this.userDetails);
        toStringBuilder.append("\ngameSettings= ");
        toStringBuilder.append(this.gameSettings);
        toStringBuilder.append("\nhighScore=");
        toStringBuilder.append(this.highScore);
        toStringBuilder.append("\nscore=");
        toStringBuilder.append(this.score);
        toStringBuilder.append("\nshipsDestroyed=");
        toStringBuilder.append(this.shipsDestroyed);
        toStringBuilder.append("\nshotsFired= ");
        toStringBuilder.append(this.shotsFired);
        toStringBuilder.append("\nnewHighScore=");
        toStringBuilder.append(this.newHighScore);
        toStringBuilder.append("]");
        return toStringBuilder.toString();
    }
    //equals method
     
    /**
     *
     * @param o
     * @return
     */
    @Override
 public boolean equals(Object o) {
        if (!(o instanceof GameDetails)) {
            return false;
        }
        GameDetails gameDetails = (GameDetails) o;
        return gameDetails.getUserDetails().equals(this.getUserDetails()) 
            && gameDetails.getGameSettings().equals(this.getGameSettings());
        
    }
   
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.userDetails);
        hash = 29 * hash + Objects.hashCode(this.gameSettings);
        hash = 29 * hash + this.highScore;
        hash = 29 * hash + this.score;
        hash = 29 * hash + this.shipsDestroyed;
        hash = 29 * hash + this.shotsFired;
        hash = 29 * hash + (this.newHighScore ? 1 : 0);
        return hash;
    }

   
 
    /**
     * calculateScoreChanges
     *
     * @return currentScore int
     */
    public int calculateScoreChanges() {

        //missedShots = shotsFired - shipsDestroyed
        int missedShots = this.shotsFired - this.shipsDestroyed;

        //currentScore = shipsDestroyed*POINTS - missedShots*POINTS
        int currentScore = (this.shipsDestroyed * POINTS_GAINED_FOR_SHIP_DESTROYED)
            - (missedShots * POINTS_LOST_FOR_WASTED_SHOT);

        //set score to currentScore
        this.score = currentScore;

        // check if it's a new high score
        if (this.score > this.highScore) {
            newHighScore = true;
            this.highScore = this.score;
        } else {
            newHighScore = false;
        }

        //return currentScore, set to 0 if currentScore negative
        if (currentScore < 0) {
            currentScore = 0;
        }
        return currentScore;
    }

    /**
     *
     * @throws Exception
     */
    public final void resetTheScoringDetails() throws Exception {
        boolean saveHighScore = GameDetailsDAOText.saveHighScore(this);
        //reset newHighScore flag
        newHighScore = false;

        // reset score, shipsDestroyed, shotsFired to 0
        this.score = 0;
        this.shipsDestroyed = 0;
        this.shotsFired = 0;

        //Load the previous high score for this user for these settings
        //If there is an error then set highscore to 0 and continue
        try {
            GameDetailsDAOText.loadHighScore(this);
        } catch (Exception ex) {
            this.highScore = 0;
        }
    }

    /**
     * saveData
     *
     * @throws SQLException
     */
    public void saveData() throws Exception {
        GameDetailsDAOText.saveData(this);
    }

    /**
     * loadData
     *
     * @throws SQLException
     */
    public void loadData() throws Exception {
        GameDetailsDAOText.loadData(this);
    }
}
