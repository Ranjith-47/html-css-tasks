import java.util.Scanner;
import java.util.HashSet;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int count = 0;
        for(int i=N1;i<=N2;i++)
        {
            if(is_repeat(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean is_repeat(int num)
    {
        int[] hash = new int[10];
        while(num!=0)
        {
            hash[num%10]++;
            num/=10;
        }
        for(int i: hash)
        {
            if(i>1) {
                return false;
            }
        }
        return true;
    }
}
