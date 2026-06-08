import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Sll {
    public static Node head = null;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val;
        while (true) {
            val = input.nextInt();
            if (val == -1)
                break;
            end_insertion(val);
        }
        display();
        /*
         * end_insertion(100);
         * display();
         */

        position_insertion(1, 500);
        display();

    }

    public static void begin_insertion(int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public static void display() {
        if (head == null)
            System.out.println("list is empty");
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void end_insertion(int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public static void position_insertion(int pos, int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            if (pos == 1) {
                newnode.next = head;
                head = newnode;
            } else
                System.out.println("position not available");
        } else {

            if (pos == 1) {
                newnode.next = head;
                head = newnode;
            } else {
                Node temp = head;
                int i;
                for (i = 1; i <= pos - 2; i += 1) {
                    if (temp.next == null)
                        break;
                    temp = temp.next;
                }
                if (i <= pos - 2)
                    System.out.println("position not availbale");
                else {
                    newnode.next = temp.next;
                    temp.next = newnode;
                }
            }

        }
    }
}
