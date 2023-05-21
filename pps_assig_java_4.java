import java.util.*;

class celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c, f = 0;
        System.out.println("Enter the value of c");
        c = sc.nextInt();

        f = (c / 5) * 9 + 32;
        System.out.println("Temp in farenheit is :" + f);

    }
}
