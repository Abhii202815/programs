import java.util.*;

class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the year");

        n = sc.nextInt();

        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
            System.out.println("Entered year is a leap year");

        else
            System.out.println("Entered year is not a leap year");
    }
}
