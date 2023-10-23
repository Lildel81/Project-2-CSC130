package project2;
import java.util.*;

class Node{
	boolean data;
	Node left;
	Node right;
	
		public Node(boolean data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
}
public class decTree {
	
	  

	  
	  private String name;
	  private boolean data;
	  private List<decTree> children;

	  public decTree(String name, boolean data){
	    this.name = name;
	    this.data = data;
	    children = new ArrayList<decTree>();
	  }

	  public String getName(){
	    return name;
	  }
	  public void setName(String name){
	    this.name = name;
	  }
	  
	  public boolean isData() {
			return data;
		}

		public void setData(boolean data) {
			this.data = data;
		}


		public List<decTree> getChildren() {
			return children;
		}
	  
	  
		public void addChild(decTree child) {
	    children.add(child);
		}


	  public static void printTree(decTree root, int level) {
	    StringBuilder indent = new StringBuilder();
	    for (int i = 0; i < level; i++) {
	        indent.append("    ");
	    }
	    System.out.println(indent.toString() + root.name + "-- " +root.data);
	    for (decTree node : root.children) {
	        printTree(node, level + 1);
	    }
	  }
	}
