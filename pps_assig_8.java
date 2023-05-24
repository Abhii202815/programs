import java.util.*;

class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Entered number is even : " + n);
        } else {
            System.out.println("Entered number is odd : " + n);
        }
    }
}
