import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        int n,flag=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number to Check");
        n=sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Number is  prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }

    }
}
