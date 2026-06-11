import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i=1;i<=N;i++)
        {
            String curr = q.poll();
            System.out.println(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}
