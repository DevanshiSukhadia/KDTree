
public class Point2D {
    
	private int xCoord;
    private int yCoord;

    // Constructor 
    public Point2D(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    // Default Constructor 
    public Point2D() {
        this(0, 0);
    }

    // Returns x coordinate
    public int getX() {
        return xCoord;
    }

    // Returns y coordinate 
    public int getY() {
        return yCoord;
    }

    // Set x coordinate 
    public void setX(int val) {
        xCoord = val;
    }

    // Set y coordinate 
    public void setY(int val) {
        yCoord = val;
    }
	
}
