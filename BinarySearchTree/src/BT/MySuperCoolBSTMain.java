package BT;


/* Class BinaryTree */
 public class MySuperCoolBSTMain
 {
     public static void main(String[] args)
    {            
    	 
        /* Creating object of BT */
    	 MySuperCoolBST<Integer> bt = new MySuperCoolBST<Integer>();    

	        bt.insert(117);
	        bt.insert(108);
	        bt.insert(54);
	        bt.insert(107);
	        bt.insert(109);
	        bt.insert(106);
	        bt.insert(99);
	        bt.insert(120);
	        bt.insert(116);
	        bt.insert(139);
	        bt.insert(119);
	        bt.insert(131);
	        bt.insert(153);
	        bt.insert(172);
	        bt.insert(140);
	        bt.insert(176);
	        bt.delete(99);
	        bt.delete(153);
	        bt.delete(108);
        
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
        
               
    }
 }
