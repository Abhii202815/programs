import java.util.*;

class ss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, rem = 0, sum = 0;

        System.out.println("Enter the value of n");

        n = sc.nextInt();

        while (n > 0) {

            rem = n % 10;
            sum = sum + rem;
            n = n / 10;

        }
        System.out.println("the sum is:" + sum);
    }
}