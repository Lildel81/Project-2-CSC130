package project2;

import java.util.*;

public class ourTree{

  
  

  
  private String name;
  private boolean data;
  private List<ourTree> children;

  public ourTree(String name, boolean data){
    this.name = name;
    this.data = data;
    children = new ArrayList<ourTree>();
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


	public List<ourTree> getChildren() {
		return children;
	}
  
  
	public void addChild(ourTree child) {
    children.add(child);
	}


  public static void printTree(ourTree root, int level) {
    StringBuilder indent = new StringBuilder();
    for (int i = 0; i < level; i++) {
        indent.append("    ");
    }
    System.out.println(indent.toString() + root.name + "-- " +root.data);
    for (ourTree node : root.children) {
        printTree(node, level + 1);
    }
  }
}


  