import java.util.*;

class areacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double area, cif;

        System.out.println("Enter the radius of circle");

        r = sc.nextInt();

        cif = 2 * 3.14 * r;
        area = 3.14 * r * r;

        System.out.println("The area of  circle is : " + area);
        System.out.println("The circumference of  circle is : " + cif);

    }
}
