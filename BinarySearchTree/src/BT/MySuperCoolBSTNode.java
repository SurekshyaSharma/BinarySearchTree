package BT;

class MySuperCoolBSTNode<T>
{    
   public MySuperCoolBSTNode<T> leftChild, rightChild;
    T data;

    /* Constructor */
    public MySuperCoolBSTNode()
    {
        leftChild = null;
        rightChild = null;
        
    }
    /* Constructor */
    public MySuperCoolBSTNode(T n)
    {
        leftChild = null;
        rightChild = null;
        data = n;
    }
    /* Function to set left node */
    public void setLeftChild(MySuperCoolBSTNode<T> n)
    {
        leftChild = n;
    }
    /* Function to set right node */ 
    public void setRightChild(MySuperCoolBSTNode<T> n)
    {
        rightChild = n;
    }
    /* Function to get left node */
    public MySuperCoolBSTNode<T> getLeftChild()
    {
        return leftChild;
    }
    /* Function to get right node */
    public MySuperCoolBSTNode<T> getRightChild()
    {
        return rightChild;
    }
    /* Function to set data to node */
    public void setData(T d)
    {
        data = d;
    }
    /* Function to get data from node */
    public T getData()
    {
        return data;
    }     
}

