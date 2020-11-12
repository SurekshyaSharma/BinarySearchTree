package learnBinaryTree;

public class BinaryTreeMain {
	public static void main(String[] args)
	{
		BinaryTree a = new BinaryTree();
		
		a.add(11);
		a.add(13);
		a.add(56);
		a.add(14);
		a.add(2);
		a.add(34);
		
		a.printPreOrder(a.root);
		
	}

}
