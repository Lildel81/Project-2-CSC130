package project2;

public class BooleanBinaryTree {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
BooleanNode root;


	public BooleanBinaryTree() {
		root = null;
	}
		// to insert a new node
		public void insert(int num, String name, boolean value) {
			root = insertRec(root, num, name, value);
		}
	
		
		public BooleanNode insertRec(BooleanNode root, int num, String name, Boolean value) {
			if (root == null) {
				root = new BooleanNode(num, name, value);
				return root;
			}
			if (num < root.num) {
				root.left = insertRec(root.left, num, name, value);
			}else {
				root.right = insertRec(root.right, num, name, value);
			}
			return root;
		}
		
		public void inOrderTraversal(vehicleClass yourCar) {
			inOrderTraversalRec(root, yourCar);
		}
		
		public void inOrderTraversalRec(BooleanNode root, vehicleClass yourCar) {
				if(root != null) {
					inOrderTraversalRec(root.left, yourCar);
					if (root.value == false) {
						System.out.println(ANSI_YELLOW + "You may not register your vehicle today");
						System.out.println("Reason code: "+ root.name + ANSI_RESET);
						yourCar.setReg(false);
						
					}
					else
						
					
					inOrderTraversalRec(root.right, yourCar);
					
				}
		}

}
