import java.util.Scanner;
public class SmallestEvenMultiple {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int N = r.nextInt();
        if(N%2==0)
        {
            System.out.println(N);
        }
        else {
            System.out.println(N*2);;
        }
    }
}
