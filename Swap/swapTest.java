import java.util.*;

public class swapTest {
    public static void main(String[] args) {
        int a,b,temp;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value of x and y");

        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Values before swapping:"+a+" "+b);

        temp=a;
        a=b;
        b=temp;
        System.out.println("Values after swapping:"+a+" "+b);

        System.out.println();



    }
}
