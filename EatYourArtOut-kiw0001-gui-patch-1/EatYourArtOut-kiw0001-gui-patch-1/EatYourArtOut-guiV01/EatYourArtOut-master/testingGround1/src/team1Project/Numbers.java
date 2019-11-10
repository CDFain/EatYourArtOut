/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team1Project;

/**
 *
 * @author CDFain
 */
public class Numbers {
    private int lines;
    private int dots;
        
    /**
     * Constructor that sets the dots and lines to the set amount of 
     * @param l int for number of lines
     * @param d int for number of dots
     */
    public Numbers(int l, int d) {
        lines = l + 1; // Due to the nature of the random operations, 1 is the "zero state", not 0
        dots = d + 1;  // hence these get 1 added to them
    }
    
    /**
     * Updates the amount of lines to this new value.
     * This does not automatically add 1 (one) even though the "zero state" for this program
     * is 0 (zero). In most cases, you do not need to add 1 for this to work as intended.
     * @param amount amount for lines to be updated to
     */
    public void updateLines(int amount) {
        this.lines = amount;
    }
    
    /**
     * Updates the amount of dots to this new value.
     * This does not automatically add 1 (one) even though the "zero state" for this program
     * is 0 (zero). In most cases, you do not need to add 1 for this to work as intended.
     * @param amount amount for dots to be updated to
     */
    public void updateDots(int amount) {
        this.dots = amount;
    }
    
    /**
     * Gets the current amount of lines.
     * This does not automatically subtract 1 (one) even though 1 (one) was added during
     * construction due to it being the "zero state" of this program.
     * @return int of the current number of lines
     */
    public int getLines() {
        return lines;
    }
    
    /**
     * Gets the current amount of dots.
     * This does not automatically subtract 1 (one) even though 1 (one) was added during
     * construction due to it being the "zero state" of this program.
     * @return int of the current number of dots
     */
    public int getDots() {
        return dots;
    }
    
    /**
     * Checks if the zero state has been achieved for both dots and lines and
     * returns the appropriate Boolean value.
     * @return Boolean value representing if both dots and lines are effectively zero
     */
    public Boolean checkZero() {
        return(dots > 1 || lines > 1);
    }
}
