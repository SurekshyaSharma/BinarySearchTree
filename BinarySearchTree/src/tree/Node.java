package tree;

class Node {

int data;
Node leftChild;
Node rightChild;
Node root;
Node current;
	public Node(int value)
 	{
 		this.data= value;
 		
 	}
	
	public Node()
 	{
 		
 		
 	}
	 
	public boolean add(int value) 
	{
		boolean added= false;
		//first check if the root is null add the value
		if (root==null)
		{
			root=new Node(value);
			return true;
		}
		else root=this.current;
		
		//second check root is not empty check left and right
		if(value<current.root.data)
		{
			//recurvise add function which takes integer and returns true or false;
			if(this.root.leftChild==null) // if the leftChild is empty create a new node and add a value
			{
				this.root.leftChild=new Node(value);
				return true;
			}
			else
				added=this.root.leftChild.add(value);
		}
			
		 if(value>this.root.data) //// if the rightChild is empty create a new node and add a value
		{
			if(this.root.rightChild==null)
			{
				this.root.rightChild=new Node(value);
				return true;
			}
		}
		 else
			 added=this.root.rightChild.add(value);
		
		 		return true;
	}
}