import java.util.*;

class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, rem = 0;

        System.out.println("Enter the value of n");

        n = sc.nextInt();

        while (n > 0) {

            rem = n % 10;
            System.out.print(rem);
            n = n / 10;

        }

    }
}