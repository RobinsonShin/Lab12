import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Shape implements Drawable
{
    protected Point[] location;
    private Color color;
    private boolean filled;
    
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public boolean isFilled()
    {
        return filled == true;
    }
    
    public Point[] getLocation()
    {
        return this.location;
    }

    @Override
    public void draw(Graphics g)
    {
        // TODO Auto-generated method stub
        
    }
}
