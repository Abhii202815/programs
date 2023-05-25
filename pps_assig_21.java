import java.util.*;

class ar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int sum = 0;

        System.out.println("Enter the array of length = 5");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum off array is :" + sum);
    }
}
