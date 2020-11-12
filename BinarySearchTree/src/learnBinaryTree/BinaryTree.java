package learnBinaryTree;

import learnBinaryTree.Node;

public class BinaryTree {

	Node root=null;
	Node current;
	
	void add(int value)
	{
		if(this.root==null)
		{
			this.root =new Node(value); 
		}
		else
		{
			this.current = this.root;
			while(this.current != null) 
			{
				if (value < this.current.data) 
				{
					this.current = this.current.leftChild;
					System.out.print(value+ " added to left\n");
					
				}
				else
					this.current = this.current.leftChild;
					System.out.print(value+ " added to right\n");
			}
			
				this.current= new Node(value);
		
			}
	}
	
	void printInorder(Node node) 
	{
		if(node.leftChild != null)
			printInorder(node.leftChild);
		System.out.print(node.data);
		if(node.rightChild != null)
			printInorder(node.rightChild);
	}
	
	void printPreOrder(Node node) 
	{
		System.out.print(node.data);
		if(node.leftChild != null)
			printInorder(node.leftChild);
		if(node.rightChild != null)
			printInorder(node.rightChild);
	}
}
