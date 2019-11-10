/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team1Project;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author CDFain
 */
public class Team1Project {
    
    /* 
     * This is making the Display JFrame called Canvas
     * I started this before we decided to name the class Canvas, so as of now
     * it is called Display.
     */
    private static JFrame frame = new JFrame("Canvas");
    // Sets the width and height values of the frame, for now these are static
    private static final int WIDTH = 690;
    private static final int HEIGHT  = 420;
    /**
     * -put something here eventually-
     */
    public Team1Project() {
        // These set the size to an unchangeable 690x420
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        
        /* 
         * This allows you to close the Canvas window without shutting down
         * the whole operation.
         */
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new Display());
        frame.setVisible(false);
                
    }
    
    /*
     * This can allow for us to adjust the visibility of the painting Canvas,
     * but I havent really used it yet. Kinda just made it cause I thought I
     * might have needed it eventually.
     */
    public void visibility(Boolean b) {
        frame.setVisible(b);
    }
}
