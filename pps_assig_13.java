import java.util.*;

class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, fact = 1;

        System.out.println("Enter the value of n");

        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of enetered number is :"+fact);

    }
}