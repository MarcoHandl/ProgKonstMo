package ue7;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree1 = new BinaryTree();
		
		tree1.add(7);
		tree1.add(5);
		tree1.add(9);
		tree1.add(4);
		tree1.add(1);
		tree1.add(2);
		tree1.add(8);

		
		System.out.println("contains(5)  --> " + tree1.contains(5));
		System.out.println("contains(97) --> " + tree1.contains(97));

		
		System.out.println("size()  --> " + tree1.size());
		System.out.println("empty() --> " + tree1.isEmpty());
		
		
		System.out.println("preorder()  --> " + tree1.traversePreOrder());
		System.out.println("inorder()   --> " + tree1.traverseInOrder());		
		System.out.println("postorder() --> " + tree1.traversePostOrder());	
		
		
	}

}
