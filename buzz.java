import java.util.*;

class buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rem = 0;

        System.out.println("Entered a number");

        n = sc.nextInt();

        rem = n % 10;

        if (rem == 7 || n % 7 == 0) {
            System.out.println("Entered number is a Buzz number");
        } else {
            System.out.println("Entered number is NOT a Buzz number");
        }
    }

}
