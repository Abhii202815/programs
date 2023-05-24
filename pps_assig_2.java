import java.util.*;

class interests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, r, t, SI;

        System.out.println("Enter principal, rate and time");

        p = sc.nextInt();
        r = sc.nextInt();
        t = sc.nextInt();

        SI = (p * r * t) / 100;
        System.out.println("The Simple Interest is : " + SI);
    }
}
