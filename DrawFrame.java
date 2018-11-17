
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen, Robinson Shin
 * @version 2018-11-16
 * Lab 12
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle leftEarOuter = new RightTriangle(new Point(235,200), 20, 100, Color.DARK_GRAY, true);
        RightTriangle leftEarInner = new RightTriangle(new Point(238,200), 10, 75, Color.PINK, true);
        RightTriangle rightEarOuter = new RightTriangle(new Point(568,200), -20, 100, Color.DARK_GRAY, true);
        RightTriangle rightEarInner = new RightTriangle(new Point(565,200), -10, 75, Color.PINK, true);
        // Eyes:
        Oval leftEyeOuter = new Oval(new Point(285,240), 50, 100, Color.WHITE, true);
        Oval leftEyeInner = new Oval(new Point(285,240), 35, 75, Color.BLACK, true);
        Oval rightEyeOuter = new Oval(new Point(515,240), 50, 100, Color.WHITE, true);
        Oval rightEyeInner = new Oval(new Point(515,240), 35, 75, Color.BLACK, true);
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400,300), 50, Color.BLACK, true);
        
        // Collar:
        Oval collarBase = new Oval(new Point(400,500), 400, 50, Color.BLUE, true);
        Circle collarCircleBase = new Circle(new Point(400,500), 75, Color.RED, true);
        Circle collarCircleOutline = new Circle(new Point(400,500), 50, Color.GREEN, false);
        
        // Square around the dog:
        Square squareOutline = new Square(new Point(400,300), 500, Color.MAGENTA, false);
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(leftEarOuter);
        drawPanel.addShape(leftEarInner);
        drawPanel.addShape(rightEarOuter);
        drawPanel.addShape(rightEarInner);
        drawPanel.addShape(leftEyeOuter);
        drawPanel.addShape(leftEyeInner);
        drawPanel.addShape(rightEyeOuter);
        drawPanel.addShape(rightEyeInner);
        drawPanel.addShape(nose);
        drawPanel.addShape(collarBase);
        drawPanel.addShape(collarCircleBase);
        drawPanel.addShape(collarCircleOutline);
        drawPanel.addShape(squareOutline);
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
