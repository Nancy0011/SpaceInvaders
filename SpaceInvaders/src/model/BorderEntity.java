package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Objects;


/**
 * Entity of the game which is a Border. Borders will have IDs so that we can query which border we are working with
 * Extends Entity class with width, height and border id
 *
 * @author sruiz
 * @author jruiz
 * @author jinghuaZhong
 * @version 1.0 initial version
 * @version 2.0 updated to get better consistency in the order of parameters
 *
 */


  public class BorderEntity extends Entity {

    //constants

    /**
     *
     */

    
    public static final int DEFAULT_WIDTH = 0;

    /**
     *
     */
    public static final int DEFAULT_HEIGHT = 0;

    /**
     *
     */
    public static final String DEFAULT_ID = "None";
    //instance variables
    private int width;
    private int height;
    private String id;    
    //no args constructors
    public BorderEntity() {
        //TODO
         this(DEFAULT_ID,DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }

    /**
     *
     * @param id
     * @param width
     * @param height
     */
    public BorderEntity(String id, int width, int height) {
        //TODO
        this(id, DEF_X, DEF_Y,width,height);
    }

    /**
     *
     * @param initalXPos
     * @param initialYPos
     * @param width
     * @param height
     */
    public BorderEntity(int initalXPos, int initialYPos, int width, int height) {
        //TODO
        this(DEFAULT_ID, initalXPos,initialYPos,width,height);
//        
    }

    //all args constructor

    /**
     *
     * @param id
     * @param initalXPos
     * @param initialYPos
     * @param width
     * @param height
     */
    public BorderEntity(String id, int initalXPos, int initialYPos, int width, int height) {
        //TODO
        
        super(DEF_REF_TO_SPRITE_IMAGE_FILE,initalXPos,initialYPos );
        this.id = id;
        this.width = width;
        this.height = height;
        
    }

     //Getters and Setters
    //TODO
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

   
    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    //Setters
    /**
     *
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    
    //toString (no equals)

    /**
     *
     * @return
     */

   
    
      @Override

      public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append(super.toString());
        toStringBuilder.append("[");
        toStringBuilder.append("\nwidth= ");
        toStringBuilder.append(this.width);
        toStringBuilder.append("\nheight=");
        toStringBuilder.append(this.height);
        toStringBuilder.append("\nid=");
        toStringBuilder.append(this.id);
        toStringBuilder.append("]");
        return toStringBuilder.toString();
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.width;
        hash = 71 * hash + this.height;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     *
     * @return
     */
    @Override
    protected Rectangle collisionArea() {
        return new Rectangle(this.getX(), this.getY(), this.width, this.height);
    }

    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(this.getX(), this.getY(), width, height);
        g.drawRect(this.getX(), this.getY(), width, height);
    }

}


