import java.util.*;

class evoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sumeven = 0,sumodd=0;

        System.out.println("Enter the value of n");
        
        n = sc.nextInt();

        

        for (int i = 1; i <= n; i++) {
            if(i%2==0){
            sumeven = sumeven+i;
            }

            else
            {
                sumodd = sumodd+i;
            }
        }

        System.out.println("Sum of odd is :"+sumodd);

        System.out.println("Sum of even is :"+sumeven);
    }
}