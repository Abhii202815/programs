import java.util.*;

class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3, m4, m5, sum;
        double percentage;

        System.out.println("Enter the marks of 5 subjects");

        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        sum = m1 + m2 + m3 + m4 + m5;
        System.out.println("The total marks obtained in 5 subjects is : " + sum);

        percentage = (sum / 500) * 100;
        System.out.println("The percentage of maarks obtained  is : " + percentage);

    }
}
