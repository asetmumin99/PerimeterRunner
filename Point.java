import edu.duke.*;
/**
 * Write a description of Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point {
    private int x;
    private int y;
    
    public Point(int coordX, int coordY){
        x = coordX;
        y = coordY;
    }
    
    public int getX() { return x; }
    public int gety() { return y; }
    
    public double distance(Point otherPt){
        return Math.sqrt( (x-otherPt.x) * (x-otherPt.x) + 
                          (y-otherPt.y) * (y-otherPt.y) );
        
    }
    
    public String toString() { return this.toString(); }
    
}
