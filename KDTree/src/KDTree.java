import java.util.*;
import java.awt.geom.Point2D;

public class KDTree {
	
	// Represents direction of the partition
	private static final boolean VERTICAL = true;
    private static final boolean HORIZOTAL = false;
	
	private Node root;
	private int size;
	
	// default empty tree
	public KDTree() {
		root = null;
		size = 0;
	}
	
	// Empty Method
    public boolean isEmpty() {
    		return root == null;
    }
    
    // Number of nodes in the tree 
    public int size() {
        return size;
    }
}
