package ue7;

public class MyBinaryTree {
	
	private Node root ;
	
	private class Node {
			
		private int value ;
		private Node left ;
		private Node right ;
		private String preorder = "";
		private String inorder = "";
		private String postorder = "";
		
		private Node(int value){
			this.value = value;
		}
		
		private void add(int val){
			if(val < value){
				if(left == null)
					left = new Node(val);
				else
					this.left.add(val);
			}else{
				//val >= value
				if(right == null)
					right = new Node(val);
				else
					this.right.add(val);
			}
		}
		
		private boolean contains(int val){
			if(val == value)
				return true;
			else if(val < value){
				if(left == null)
					return false;
				else
					return left.contains(val);
			}else{
				if(right == null)
					return false;
				else
					return right.contains(val);
			}
		}
	 
		private int size(){
			if(left == null && right == null)
				return 1;
			
			else if(right == null)
				return 1 + left.size();
			
			else if(left == null)
				return 1 + right.size();
			
			else
				return 1 + left.size() + right.size();
		}
		
		private String preorder(){
			
			preorder += this.value + " ";
			
			if(left != null)
				preorder += left.preorder();
			
			if(right != null)
				preorder += right.preorder();
			
			return preorder;
		}
		
		private String inorder(){
			if(left != null)
				inorder += left.inorder();
			
			inorder += this.value + " ";
			
			if(right != null)
				inorder += right.inorder();
			
			return inorder;
		}
		
		private String postorder(){
			if(left != null)
				postorder += left.postorder();
			
			if(right != null)
				postorder += right.postorder();
			
			postorder += this.value + " ";
			
			return postorder; 
		}
	}
	
	public void add(int val){
		if(root == null)
			root = new Node(val);
		else
			root.add(val);
	}
	
	public boolean contains(int val){
		if(root == null)
			return false;
		else
			return root.contains(val);
	}
	
	
	public boolean empty(){
		return root == null ? true : false;
	}
	
	public int size(){
		if(root == null)
			return 0;
		else
			return root.size();
	}
	

	public String preorder(){
		return (this.empty()) ? "baum ist leer" : root.preorder(); 
	}
	
	public String inorder(){
		return (this.empty()) ? "baum ist leer" : root.inorder(); 
	}
	
	public String postorder(){
		return (this.empty()) ? "baum ist leer" : root.postorder(); 
	}
	
}
