import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int N1 = r.nextInt();
        int N2 = r.nextInt();
        for(int i = N1;i<=N2;i++)
        {
            if(Isprime(i) && i!=1)
            {
                System.out.print(i+ " ");
            }
        }
    }
    static boolean Isprime(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}