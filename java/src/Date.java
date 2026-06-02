import java.util.Scanner;

public class Date
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
        {
            if(month==2)
            {
                if(date>0 && date<=29)
                {
                    System.out.println("Valid");
                    return;
                }
                System.out.println("Invalid");
            }
        }
        if(month==2)
        {
            if(date>0 && date<=28)
            {
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        if(month==4 || month==6 || month==9 || month==11){
            if(date>0 && date<=30)
            {
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else if(month!=2){
            if(date>0 && date<=31)
            {
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }

        }
    }
}
