import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        int f, l, flag;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        f = sc.nextInt();
        System.out.println("Enter the last number");
        l = sc.nextInt();
        for (int i = f; i <= l; i++) {
            flag=0;
            for (int j = 2; j <i; j++) {

                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }

        }
    }
}
