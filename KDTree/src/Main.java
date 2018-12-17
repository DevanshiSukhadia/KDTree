import java.awt.geom.Point2D;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		FileReader file = new FileReader("points.txt");
                
       	 	KDTree kdTree = new KDTree();
        	while (file.read() != -1) {
            		int x = file.read();
            		int y = file.read();
            		Point2D p = new Point2D(x, y);
            		kdTree.insert(p);
            		kdTree.search(p);
            		
        	}
       
        	// (50,80),(25,45),(70,75),(55,10),(60,85)
		
		Rect r = new Rect();
		r.drawRect();
	}
}
