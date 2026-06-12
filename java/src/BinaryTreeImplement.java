import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BNode
{
    int data;
    BNode left;
    BNode right;
    BNode(int data)
    {
        this.data = data;
    }
}

public class BinaryTreeImplement {
    public static BNode root = null;
    public static void main() {
        Scanner sc =new Scanner(System.in);
        int ele;
        while(true)
        {
            ele = sc.nextInt();
            if(ele==-1)
                break;
            insertion(ele);
        }
       /* System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("prerder");
        preorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println();
        System.out.println("level order");
        level_order();*/
        level_order();
        System.out.println();
        deletion(10);
        level_order();


    }
    public static BNode create_node(int val)
    {
        BNode newnode = new BNode(val);
        return newnode;
    }
    public static void insertion(int val)
    {
        if(root==null)
        {
            root = create_node(val);
            return;
        }
        Queue<BNode> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty())
        {
            BNode cur = que.poll();
            if(cur.left == null)
            {
                cur.left = create_node(val);
                return;
            }
            else que.offer(cur.left);

            if(cur.right==null)
            {
                cur.right = create_node(val);
                return;
            }
            else que.offer(cur.right);

        }
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
    public static void preorder(BNode node)
    {
        if(node!=null)
        {
            System.out.print(node.data+" ");
            inorder(node.left);
            inorder(node.right);
        }
    }
    public static void postorder(BNode node)
    {
        if(node!=null)
        {
            inorder(node.left);
            inorder(node.right);
            System.out.print(node.data+" ");
        }
    }
    public static void level_order()
    {
        if(root==null)
            return;
        Queue<BNode> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty())
        {
            BNode cur  = que.poll();
            System.out.print(cur.data+" ");

            if(cur.left!=null)
                que.offer(cur.left);
            if(cur.right!=null)
                que.offer(cur.right);
        }

    }
    public static void deletion(int key)
    {
        if(root==null)
        {
            System.out.println("treee is empty");
            return;
        }
        if(root.left==null & root.right==null)
        {
            if(root.data == key){
                root = null;
                return;
            }

        }
        BNode target = null;
        BNode last = null;

        Queue<BNode> que  = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty())
        {
            last = que.poll();

            if(last.data==key)
            {
                target = last;
            }
            if(last.left!=null)
                que.offer(last.left);
            if(last.right!=null)
                que.offer(last.right);
        }
        if(target!=null)
        {
            target.data = last.data;
            delete_last_node(last);
        }
    }
    public static void delete_last_node(BNode dnode)
    {
         Queue<BNode> que = new LinkedList<>();
         que.offer(root);

         while(!que.isEmpty())
         {
             BNode cur = que.poll();

             if(cur.left==dnode)
             {
                 cur.left = null;
                 return;
             }
             else que.offer(cur.left);
             if(cur.right==dnode)
             {
                 cur.right = null;
                 return;
             }
             else que.offer(cur.right);
         }
    }
}
