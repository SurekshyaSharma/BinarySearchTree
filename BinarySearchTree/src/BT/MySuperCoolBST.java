package BT;


class MySuperCoolBST<T>
 {
	 MySuperCoolBSTNode<T> root;
 
     public MySuperCoolBST()
     {
         root = null;
     }
     
     public boolean isEmpty()
     {
         return root == null;
     }
 
     public void insert(T data)
     {
         root = insert(root, data);
     }
   
     private MySuperCoolBSTNode<T> insert(MySuperCoolBSTNode <T> node, T data)
     {
         if (node == null)
             node = new MySuperCoolBSTNode<T>(data);
         else
         {
             if ((int) data < (int) node.data)
                 node.leftChild = insert(node.leftChild, data);
             else
                 node.rightChild = insert(node.rightChild, data);             
         }
         return node;
     }     
      
     void delete(T data)
     {
    	 root = delete(root, data); 
     }
     private MySuperCoolBSTNode<T> delete(MySuperCoolBSTNode<T> node, T data)
     {
    	 //if the tree is empty return null 
    	 if (node == null) throw new RuntimeException("cannot delete.");
    	 else
			
    	 
	    	 if ((int) data < (int) node.data)
	    		 node.leftChild = delete(node.leftChild, data); 
	         else if ((int) data > (int) node.data)
	        	 node.rightChild = delete(node.rightChild, data); 
	   
	         // if key is same as root's key, then This is the node 
	         // to be deleted 
	         else
	         { 
	             // node with only one child or no child 
	             if (node.leftChild == null) 
	                 return node.rightChild; 
	             else if (node.rightChild == null) 
	                 return node.leftChild; 
	             else
	             {
	             // node with two children: Get the in order successor (smallest 
	             // in the right subtree) 
	            	 node.data = retrieveData(node.leftChild);
	   
	             // Delete the in order successor 
	            	 node.data = retrieveData(node.rightChild);
	             }
	         } 
   
         return node; 
     }
     
     private T retrieveData(MySuperCoolBSTNode<T> p)
     {
        while (p.rightChild != null) 
        	{
        	p = p.rightChild;
        	}

        return p.data;
     }
    
	T minValue(MySuperCoolBSTNode<T> root)
     {
    	 T minValue = root.data;
    	 while(root.leftChild != null)
    	 {
    		 minValue = root.leftChild.data;
    		 root= root.leftChild;
    	 }
    	 return  minValue;
     }
 
     public void inorder()
     {
         inorder(root);
     }
     private void inorder(MySuperCoolBSTNode<T> r)
     {
         if (r != null)
         {
             inorder(r.getLeftChild());
             System.out.print(r.getData() +" ");
             inorder(r.getRightChild());
         }
     }

     public void preorder()
     {
         preorder(root);
     }
     private void preorder(MySuperCoolBSTNode<T> r)
     {
         if (r != null)
         {
             System.out.print(r.getData() +" ");
             preorder(r.getLeftChild());             
             preorder(r.getRightChild());
         }
     }
   
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(MySuperCoolBSTNode<T> r)
     {
         if (r != null)
         {
             postorder(r.getLeftChild());             
             postorder(r.getRightChild());
             System.out.print(r.getData() +" ");
         }
     }    
     
      
 }
 
 