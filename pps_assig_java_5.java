import java.util.*;

class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, a, b;

        System.out.println("Enter the values of a and b");

        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Now the value of a after swapping is : " + a);
        System.out.println("Now the value of b after swapping is : " + b);

    }
}
