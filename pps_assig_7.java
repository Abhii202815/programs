import java.util.*;

class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the values of a, b and c");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b & a > c) {
            System.out.println("The maximum of three numbers is  : " + a);
        } else if (b > a & b > c) {
            System.out.println("The maximum of three numbers is  : " + b);
        } else {
            System.out.println("The maximum of three numbers is  : " + c);
        }

    }

}
