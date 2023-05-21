import java.util.*;

class natnumsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, add = 0;

        System.out.println("Enter the value of n");

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            add = add + i;
        }
        System.out.println("SUM IS:" + add);

    }
}