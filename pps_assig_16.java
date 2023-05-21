import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, f = 0;

        System.out.println("Enter the value of n");

        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                f = f + 1;
            }

        }

        if (f == 1)
            System.out.println("Entered number is  a prime number");

        else
            System.out.println("Entered number is not a prime number");

    }
}
