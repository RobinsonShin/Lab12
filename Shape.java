import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This class holds the location and color of the shape, as well as whether the
 * shape is filled, and implements Drawable.
 * 
 * @author Robinson Shin
 * @version 2018-11-17 Lab 12
 */
public class Shape implements Drawable
{
    // Holds the locations of the Points to represent the shape
    protected Point[] location;

    // The color of the shape
    private Color color;

    // Determines if the shape is filled or not
    private boolean filled;

    /**
     * The constructor for the Shape class
     * 
     * @param color
     *            the color of the shape
     * @param filled
     *            whether the Shape is filled or not
     */
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Retrieve the shape's color
     * 
     * @return Color the color of the shape
     */
    public Color getColor()
    {
        return this.color;
    }

    /**
     * Returns true if the space occupied by the shape is to be filled by the
     * color, false otherwise
     * 
     * @return boolean whether the shape is filled or not
     */
    public boolean isFilled()
    {
        return filled == true;
    }

    /**
     * Returns a Point array that contains all the points used to de ne the
     * shape
     * 
     * @return Point[] the locations of the shape
     */
    public Point[] getLocation()
    {
        return this.location;
    }

    /**
     * Only here to let the other classes use draw
     */
    @Override
    public void draw(Graphics g)
    {
        // TODO Auto-generated method stub

    }
}
