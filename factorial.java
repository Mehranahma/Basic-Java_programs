import java.util.*;

public class factorial {

    public static void main(String[] args) {
        int n, x, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number to check the factorial");
        n = sc.nextInt();

        x = n - 1;
        while(x>0) {
            n = n * x;

            x--;
        }
        System.out.println("The factorial of the given Number is \t"+n);

    }

}
