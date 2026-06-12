import java.util.Scanner;

public class BST_implement {
    public static BNode root = null;
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int ele;
        while(true)
        {
            ele = sc.nextInt();
            if(ele==-1)
                break;
            root = insertion(root,ele);
        }
       inorder(root);
    }
    public static BNode create_node(int val)
    {
        BNode newnode = new BNode(val);
        return newnode;
    }

    public static BNode insertion(BNode node ,int val)
    {
        if(node==null)
        {
            return create_node(val);
        }
        if(node.data > val)
            node.left = insertion(node.left,val);
        if(node.data < val)
            node.right = insertion(node.right,val);

        return node;
    }
    public static void inorder(BNode node)
    {
        if(node!=null)
        {
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
        }
    }
}
