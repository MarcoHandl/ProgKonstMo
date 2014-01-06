package ue7;

/**
 * @author moser
 *
 */
public class BinaryTree {
	
	private Node root;
	
	/**
	 * 
	 * @param elem
	 */
	public void add(int elem){
		// wenn wurzel leer --> erstes element wird als wurzel genommen
		if(root == null){
			root = new Node(elem);
		}
		//sonnst haenge element an wurzelknoten
		else{
			root.add(elem);
		}
	}
	
	/**
	 * 
	 * @param elem
	 * @return
	 */
	public boolean contains (int elem){
		
		if(root.value==elem){
			return true;
		}
		else{
			return root.contains(elem);
		}

	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty(){
		if(root==null){
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public int size(){
		
		if(isEmpty()) return 0;
		
		return root.size();
	}
	
	/**
	 * traversiert den Baum in Inorder Reihenfolge
	 * Zuerst wird der LINKE Teilbaum ausgegeben, 
	 * dann die MITTE, dann der RECHTE
	 * @return String, der die Elemente des Baumes in Inorder 
	 * 			Reihenfolge enthaelt
	 */
	public String traverseInOrder(){
		
		if(isEmpty()) return "Tree is empty!";
		
		return root.traverseInOrder();
	}
	
	/**
	 * traversiert den Baum in PreOrder Reihenfolge
	 * Zuerst wird die MITTE ausgegeben, 
	 * dann der LINKE Teilbaum, dann der RECHTE
	 * @return String, der die Elemente des Baumes in PreOrder 
	 * 			Reihenfolge enthaelt
	 */
	public String traversePreOrder(){
		
		if(isEmpty()) return "Tree is empty!";
		
		return root.traversePreOrder();
	}	
	
	/**
	 * traversiert den Baum in PostOrder Reihenfolge
	 * Zuerst wird der LINKE Teilbaum ausgegeben, 
	 * dann er RECHTE, dann die MITTE 
	 * @return String, der die Elemente des Baumes in PostOrder 
	 * 			Reihenfolge enthaelt
	 */
	public String traversePostOrder(){
		
		if(isEmpty()) return "Tree is empty!";
		
		return root.traversePostOrder();
	}	
	
	
	/**
	 * innere Klasse Node, stellt einen Knoten des Baumes dar
	 * @author moser
	 *
	 */
	private class Node{
		
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value) {
			super();
			this.value = value;
		}
		
		/**
		 * 
		 * @param elem
		 */
		private void add(int elem){

			//wenn kleiner, gehe in linken teilbaum
			if(elem < value){
				//wenn linker unterplatz leer, haenge element dort an
				if(left == null){
					left = new Node(elem);
				}
				//wenn platz bereits besetzt rufe add im linken unteren knoten auf
				else{
					left.add(elem);
				}
				
			}
			//wenn goesszer, gehe in rechten teilbaum
			if(elem >= value){
				//wenn rechter unterplatz leer, haenge element dort an
				if(right == null){
					right = new Node(elem);
				}
				//wenn platz bereits besetzt rufe add im rechten unteren knoten auf
				else{
					right.add(elem);
				}			
			}			
			
		}
		
		
		/**
		 * 
		 * @param elem
		 * @return
		 */
		private boolean contains (int elem){

			if(this.value==elem){
				return true;
			}
			else if(right==null && left == null){
				return false;
			}
			else{
				
				if(right== null){
					return left.contains(elem);
				}
				if(left== null){
					return right.contains(elem);
				}
				
				return right.contains(elem) || left.contains(elem);
			}
			
		}
		
		/**
		 * 
		 * @return
		 */
		private int size(){
			
			if(left==null && right == null){
				return 1;
			}
			
			if(right == null){
				return 1+left.size();
			}
			if(left == null){
				return 1+right.size();
			}
			
			return 1+ right.size() + left.size();

		}
		
		
		private String traverseInOrder(){
			
			if(left==null && right == null){
				return String.valueOf(this.value);
			}
			
			if(right == null){
				return String.valueOf(this.value) + "," + left.traverseInOrder();
			}
			if(left == null){
				return String.valueOf(this.value) + "," + right.traverseInOrder();
			}
			
			return left.traverseInOrder() + ","
					+String.valueOf(this.value) + ","
					+ right.traverseInOrder();
		}
		

		private String traversePreOrder(){
			
			if(left==null && right == null){
				return String.valueOf(this.value);
			}
			
			if(right == null){
				return String.valueOf(this.value) + "," + left.traversePreOrder();
			}
			if(left == null){
				return String.valueOf(this.value) + "," + right.traversePreOrder();
			}
			
			return String.valueOf(this.value) + ","
					+ left.traversePreOrder() + ","
					+ right.traversePreOrder();
		}	
		
		private String traversePostOrder(){
			
			if(left==null && right == null){
				return String.valueOf(this.value);
			}
			
			if(right == null){
				return String.valueOf(this.value) + "," + left.traversePostOrder();
			}
			if(left == null){
				return String.valueOf(this.value) + "," + right.traversePostOrder();
			}
			
			return left.traversePostOrder() + ","
					+ right.traversePostOrder() + ","
					+ String.valueOf(this.value);
		}	
		
	}
	
	
}
