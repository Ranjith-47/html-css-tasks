import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner r = new Scanner(System.in);
//        int N = r.nextInt();
//        int product = 1;
//        int sum = 0;
//        int temp = N;
//        while(N!=0)
//        {
//            product *= N%10;
//            sum += N%10;
//            N/=10;
//        }
//        System.out.println(product - sum);
//        int a = -10;
//        System.out.println(a>>2);
        Scanner sc = new Scanner(System.in);
        int big = 0;
        int small = 99999;
        boolean value = true;
        int total = 0;
        int count = 0;
        while(value)
        {
            int A = sc.nextInt();
            if(A!=-1)
            {
                total += A;
                count++;
                if(A > big)
                {
                    big = A;
                }
                if(A < small)
                {
                    small = A;
                }
            }
            else{
                value = false;
            }
        }
        System.out.println("Biggest value:"+ big);
        System.out.println("Smallest value:"+small);
        System.out.println("Total:"+total);
        float avg = total/count;
        System.out.printf("Average: %.2f",avg);

    }
}
