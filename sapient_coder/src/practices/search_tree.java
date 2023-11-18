package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class search_tree {

	  static class BST  {

	    private Node root;

	    public BST() {
	      this.root = new Node();
	    }

	    public void put(int value) {
	    	put (value,root);
	      // your code
	    }

	    private void put(int value, Node node) {
			// TODO Auto-generated method stub
			if(node.val==null) {
				node.val=value;
			}else {
				if(value<node.val) {
					if(node.left==null) {
						node.left=new Node();
					}
					put(value,node.left);
					}
				else {
						if(node.right==null) {
							node.right=new Node();
						}
						put(value,node.right);
					}
				}
			}
		

		public boolean contains(int value) {
	      
	      return contains(value,root);
	    }

	    private boolean contains(int value, Node node) {
	    	if(node==null||node.val==null) {
			return false;
			}
	    	else {
				if(value==node.val) {
					return true;
				} else if(value<node.val) {
					return contains(value,node.left);
					} else {
						return contains(value,node.right);
					}
			}
			
		}

		public List<Integer> inOrderTraversal() {
	      final ArrayList<Integer> acc = new ArrayList<>();
	      inOrderTraversal(root, acc);
	      return acc;
	    }

	    private void inOrderTraversal(Node node, List<Integer> acc) {
	      if (node == null||node.val==null) {
	        return;
	      }
	      inOrderTraversal(node.left, acc);
	    	      acc.add(node.val);
	      inOrderTraversal(node.right, acc);
	    }

	    private static class Node {
	      Integer val;
	      Node left;
	      Node right;
	    }
	  }


	   public static void main(String[] args) {
	    
		  final BST searchTree = new BST();

		    searchTree.put(3);
		    searchTree.put(1);
		    searchTree.put(2);
		    searchTree.put(5);
		    
		    if(Arrays.asList(1,2,3,5).equals(searchTree.inOrderTraversal())
		    		&& !searchTree.contains(0) 
		    		&& searchTree.contains(1)
		    		&& searchTree.contains(2)
		    		&& searchTree.contains(3)
		    		&& !searchTree.contains(4)
		    		&& searchTree.contains(5)
		    		&& !searchTree.contains(6)){
		    	System.out.println("Pass");
		    }else {
		    	System.out.println("Fail");
		    }
		    		
	  }
}
