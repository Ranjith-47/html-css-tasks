import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BNode {
    int val;
    BNode left;
    BNode right;
    BNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeImplement {
    public static BNode root = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while(true) {
            a = sc.nextInt();
            if(a == -1) {
                break;
            }
            insert(a);
        }
        System.out.println("\nInorder traversal: ");
        inorder(root);
        System.out.println("\nPreorder traversal: ");
        preorder(root);
        System.out.println("\nPostorder traversal: ");
        postorder(root);
        System.out.println("\nLevelorder traversal: ");
        levelorder(root);
        sc.close();
    }

    public static BNode create_node(int val) {
        return new BNode(val);
    }

    public static void insert(int x) {
        if(root == null) {
            root = create_node(x);
            return;
        }
        Queue<BNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            BNode cur = q.poll();
            if(cur.left == null) {
                cur.left = create_node(x);
                return;
            } else {
                q.offer(cur.left);
            }
            if(cur.right == null) {
                cur.right = create_node(x);
                return;
            } else {
                q.offer(cur.right);
            }
        }
    }

    public static void inorder(BNode node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }

    public static void preorder(BNode node) {
        if(node != null) {
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void postorder(BNode node) {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.val + " ");
        }
    }

    public static void levelorder(BNode node) {
        if(node == null) {
            return;
        }
        Queue<BNode> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()) {
            BNode cur = q.poll();
            System.out.print(cur.val + " ");
            if(cur.left != null) {
                q.offer(cur.left);
            }
            if(cur.right != null) {
                q.offer(cur.right);
            }
        }
    }

}
