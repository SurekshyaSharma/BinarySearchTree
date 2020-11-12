package tree;

public class Binarytree
{
	Node root;
	public boolean add(int value) 
	{
		if(root==null)
		{
			root=new Node(value);
			return true;
		}
		else
			return root.add(value);
	}
	
}
