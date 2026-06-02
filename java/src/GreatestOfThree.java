import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        if (A > B) {
            if (A > C) {
                if(A>D)
                {
                    System.out.println("A is greatest");
                }
                else{
                    System.out.println("D is greatest");
                }
            }
            else{
                if(C>D)
                {
                    System.out.println("C is greatest");
                }
            }
       }
        else if(B>C)
            {
                if(B>D)
                {
                    System.out.println("B is greatest");
                }
            }
            else if(C>D)
                {
                    System.out.println("C is greatest");
                }
            else{
            System.out.println("D is greatest");
        }
    }
}
