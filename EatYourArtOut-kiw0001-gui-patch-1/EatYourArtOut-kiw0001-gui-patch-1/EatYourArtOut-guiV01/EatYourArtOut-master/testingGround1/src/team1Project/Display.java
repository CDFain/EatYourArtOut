/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team1Project;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author CDfain
 */
public class Display extends JPanel {
    // Random object that's used a lot
    private Random r = new Random();
    // The cap on the amounts of lines and dots
    private int lineCap, dotCap;
    // The maximum and minimum of the thiccness of lines and dots
    private int dotThiccMax, dotThiccMin, lineThiccMax, lineThiccMin;
    // Numbers object that is used for storing and updating line and dot
    // amounts throughout the drawing process
    private Numbers num;
    
    // Basic constructor boi
    public Display() {
        setLayout(null);
    }
    
    // Hard coded drawing functionality in a separate window.
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.WHITE);
        
        // These can be eventually made into User Inputs
        lineCap = 10; // Called lineCap and dotCap since sometimes drawn dots and lines can be hidden behind 
        dotCap = 10;  // other things, effectively reducing the number of them from the user's point of view
        dotThiccMax = 50;
        dotThiccMin = 10;
        lineThiccMax = 30;
        lineThiccMin = 5;
        // Make num be a Numbers object with the respective amount of lines and dots
        num = new Numbers(lineCap, dotCap);
        
        /* 
         * This while statement will draw random amounts of dots and lines
         * each iteration until the specified amount of both dots and lines
         * have been drawn. This allows for the drawn lines and dots to be
         * overlapped instead of either all the dots or all the lines be on
         * bottom and the other to be entirely on top.
         */
        while (num.checkZero())
        {
            // Random values for the Dots and Lines amounts
            int dotNext = r.nextInt(num.getDots());
            int lineNext = r.nextInt(num.getLines());
            
            /* Only used this to help figure out issues happening with the loop;
             * This will be commented out so I can quickly use it again
             * in the event that I mess with this loop and need to make sure
             * it still works properly            
             */
            // System.out.println(dotNext + " " + lineNext);
            
            // These are all ints used in construction of the dots and lines
            int a, b, c, d, e, red, green, blue;
            for(int i = dotNext; i > 0; --i) {
                            
                /* 
                 * Dot values
                 * 
                 */
                a = r.nextInt(660) - 10;                                 // X position of top left corner on screen
                b = r.nextInt(390) - 10;                                 // Y position of top left corner on screen
                c = r.nextInt(dotThiccMax - dotThiccMin) + dotThiccMin;  // Thiccness of the dot
                
                // Sets color for the dot
                // Each color can only be 0, 51, 102, 153, 205, or 255
                // Im working on a better solution to the color problem
                red = r.nextInt(5) * 51; 
                green = r.nextInt(5) * 51;
                blue = r.nextInt(5) * 51;
                g.setColor(new Color(red, green, blue));
                
                // This draws the dot
                g.fillOval(a, b, c, c);
            }
            for (int i = lineNext; i > 0; --i) {
                /* 
                 * Line values
                 *  b, c, d, and e all allow for lines to start or end just past
                 *  the edges of the screen.
                 */            
                a = r.nextInt(lineThiccMax - lineThiccMin) + lineThiccMin;  // The thiccness of the line
                b = r.nextInt(700) - 5; // The X position of the start
                c = r.nextInt(430) - 5; // The Y position of the start
                d = r.nextInt(700) - 5; // The X position of the end
                e = r.nextInt(430) - 5; // The Y position of the end
                
                // Sets color for the line
                // Each color can only be 0, 51, 102, 153, 205, or 255
                red = r.nextInt(5) * 51;
                green = r.nextInt(5) * 51;
                blue = r.nextInt(5) * 51;
                g.setColor(new Color(red, green, blue));
                // These draw the line
                g2.setStroke(new BasicStroke(a));
                g2.draw(new Line2D.Float(b, c, d, e));                
            }
            num.updateDots(num.getDots() - dotNext);
            num.updateLines(num.getLines() - lineNext);
        }
        
        
    }
    /*
    *****Some things that we need;*****
    
    setDotThiccMax
    setDotThiccMin
    
    setLineThiccMax
    setLineThiccMin
    
    setDotCap
    setLineCap
    
    Some way to control colors different from what I have now since right now is doo-doo
    
    setBackgroundColor
    
    A way to save the generated art to a string/ array/ arraylist to eventually be
    saved to a file so that we can implement persistence.
    
    probably more honestly
    */
}
