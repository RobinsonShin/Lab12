import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen, Robinson Shin
 * @version 2018-11-17
 * Lab 12
 */
public class RectangleTestOfficial
{
    // TODO: implement this.
    private static Rectangle rec1 = new Rectangle(new Point(100, 100), 100, 50, Color.BLACK, true);
    private static Point rec1UL = new Point(50, 75);
    private static Point rec1LL = new Point(50, 125);
    private static Point rec1UR = new Point(150, 75);
    private static Point rec1LR = new Point(150, 125);
    private static Rectangle rec2 = new Rectangle(new Point(150, 150), 50, 100, Color.CYAN, false);
    private static Point rec2UL = new Point(125, 100);
    private static Point rec2LL = new Point(125, 200);
    private static Point rec2UR = new Point(175, 100);
    private static Point rec2LR = new Point(175, 200);

    /**
     * Right number of points?
     */
    @Test
    public void testSquareConstructorPointsArrayLength()
    {
        Point[] pts = rec1.getLocation();
        Assert.assertEquals(4, pts.length);
    }
    
    /**
     * Check points
     */
    @Test
    public void testSquareConstructorCalculatedPoints()
    {
        Point[] pts1 = rec1.getLocation();
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, rec1UL));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, rec1LL));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, rec1LR));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, rec1UR));
        
        Point[] pts2 = rec2.getLocation();
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, rec2UL));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, rec2LL));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, rec2LR));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, rec2UR));
        
    }
    
    /**
     * Unfilled case
     */
    @Test
    public void testSquareConstructorUnfilled()
    {
        Assert.assertFalse("Square fill incorrect.", rec2.isFilled());
    }
    
    /**
     * Filled case
     */
    @Test
    public void testSquareConstructorFilled()
    {
        Assert.assertTrue("Square fill incorrect.", rec1.isFilled());
    }
    
    /**
     * Color
     */
    @Test
    public void testSquareConstructorColor()
    {
        Color clr1 = rec1.getColor();
        Color clr2 = rec2.getColor();
        Assert.assertEquals("Square color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Square color incorrect.", Color.CYAN, clr2);
    }
}
