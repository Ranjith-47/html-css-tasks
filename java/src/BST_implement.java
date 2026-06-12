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
        System.out.println();
        delete_key(root,20);
        inorder(root);
        System.out.println();
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
    public static BNode delete_key(BNode node,int key)
    {
        if(root == null)
        {
            System.out.println("Empty");
            return null;
        }
        if(key < node.data)
        {
            delete_key(node.left, key);
        }
        else if(key > node.data)
        {
            delete_key(node.right, key);
        }
        else{
            if(node.left == null && node.right==null)
            {
                return null;
            }
            if(node.left==null)
            {
                return node.right;
            }
            if(node.right==null)
            {
                return node.left;
            }
            BNode successor = next_node(node.right);
            node.data = successor.data;
            node.right = delete_key(node.right, successor.data);
        }
        return node;
    }
    public static BNode next_node(BNode node)
    {
        while(node.left != null)
        {
            node = node.left;
        }
        return node;
    }
}
