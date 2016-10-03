package com.vijay.datastructure.tree;

public class BinaryTree {

	 Node root;  
	 Node prev;
	  
	     boolean checkBST()  {
	         prev = null;
	         return checkBST(root);
	     }

	     boolean checkBST(Node root) {
	         if (root!=null){
	             if (!checkBST(root.left))
	                 return false;
	             
	              if (prev != null && root.data <= prev.data )
	                 return false;
	             prev = root;
	             return checkBST(root.right);
	         }
	          return true;
	        
	     }


	/* Driver program to test above functions */
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		//IS BST
		/*tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);		*/
		
		//IS NOT BST
		tree.root = new Node(3);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(4);
		
		System.out.println(tree.root.printMe());

		if (tree.checkBST())
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
	}
}

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
	
	public String printMe(){
		//return "data="+data+" \n\t| left="+(left==null?"":left.printMe())+" \n\t| right="+(right==null?"":right.printMe());
		return "data="+data+" \n\t| "+(left==null?"NULL":left.printMe())+" \n\t| right="+(right==null?"NULL":right.printMe());
	}
}
