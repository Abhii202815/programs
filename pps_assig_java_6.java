import java.util.*;

class ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the values of a and b");

        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            System.out.println("The entered numbers are equal");
        } else {
            System.out.println("The entered numbers are not equal");
        }
    }
}
