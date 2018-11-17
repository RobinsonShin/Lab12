
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Stephen, Robinson Shin
 * @version 2018-11-16
 * Lab 12
 */
public class RightTriangleTestOfficial
{
    // TODO: complete testing
    private static RightTriangle tri1 = new RightTriangle(new Point(100, 100), 50, 50, Color.BLACK, true);
    private static Point tri1Vertex1 = new Point(100, 100);
    private static Point tri1Vertex2 = new Point(150, 100);
    private static Point tri1Vertex3 = new Point(100, 50);
    private static RightTriangle tri2 = new RightTriangle(new Point(50, 70), -25, -25, Color.CYAN, false);
    private static Point tri2Vertex1 = new Point(50, 70);
    private static Point tri2Vertex2 = new Point(25, 70);
    private static Point tri2Vertex3 = new Point(50, 95);

    /**
     * RightTriangle construction
     */
    @Test
    public void testPolyLineConstructorPointsArrayLength()
    {
        Point[] pts = tri1.getLocation();
        Assert.assertEquals(3, pts.length);
    }
    
    /**
     * RightTriangle construction: points
     */
    @Test
    public void testPolyLineConstructorCalculatedPoints()
    {
        Point[] pts1 = tri1.getLocation();
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the RightAngle vertex "
                + "and that the base and height is used correctly.",
                ShapeUtils.pointInSet(pts1, tri1Vertex1));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the RightAngle vertex "
                + "and that the base and height is used correctly.",
                ShapeUtils.pointInSet(pts1, tri1Vertex2));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the RightAngle vertex "
                + "and that the base and height is used correctly.",
                ShapeUtils.pointInSet(pts1, tri1Vertex3));
        
        Point[] pts2 = tri2.getLocation();
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the RightAngle vertex "
                + "and that the base and height is used correctly.",
                ShapeUtils.pointInSet(pts2, tri2Vertex1));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the RightAngle vertex "
                + "and that the base and height is used correctly.",
                ShapeUtils.pointInSet(pts2, tri2Vertex2));
        Assert.assertTrue("Expected point not appearing in RightTriangle. Make sure that the points determine the RightAngle vertex "
                + "and that the base and height is used correctly.",
                ShapeUtils.pointInSet(pts2, tri2Vertex3));
    }
    
    /**
     * Unfilled constructor
     */
    @Test
    public void testPolyLineConstructorUnfilled()
    {
        Assert.assertFalse("Triangle fill incorrect.", tri2.isFilled());
    }
    
    /**
     * Filled constructor
     */
    @Test
    public void testPolyLineConstructorFilled()
    {
        Assert.assertTrue("Triangle fill incorrect.", tri1.isFilled());
    }
    
    /**
     * Color constructor
     */
    @Test
    public void testPolyLineConstructorColor()
    {
        Color clr1 = tri1.getColor();
        Color clr2 = tri2.getColor();
        Assert.assertEquals("Triangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Triangle color incorrect.", Color.CYAN, clr2);
    }
}
