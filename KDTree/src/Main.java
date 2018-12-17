import java.awt.geom.Point2D;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		KDTree kdTree = new KDTree();
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("points.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(scanner.hasNextInt())
		{
			int x = scanner.nextInt();
		    int y = scanner.nextInt();
		    Point2D p = new Point2D.Double(x, y);
		    
		    System.out.println("Point: " + p.getX() + ", " + p.getY());
		    kdTree.insert(p);
		}
       
        	// (50,80),(25,45),(70,75),(55,10),(60,85)
		
		Rect r = new Rect();
		r.drawRect();
	}
}
