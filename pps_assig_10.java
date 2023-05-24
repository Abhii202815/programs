import java.util.*;

class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3, m4, m5, sum;
        float percentage;

        System.out.println("Enter the marks of 5 subjects");

        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        sum = m1 + m2 + m3 + m4 + m5;
        System.out.println("The total marks obtained in 5 subjects is : " + sum);

        percentage = (sum * 100) / 150;
        System.out.println("The percentage of maarks obtained  is : " + percentage);

        if (percentage > 90)
            System.out.println("Grade is A");

        else if (percentage > 80 && percentage <= 90)
            System.out.println("Grade is B");

        else if (percentage > 60 && percentage <= 80)

            System.out.println("Grade is C");

        else if (percentage < 60)

            System.out.println("Grade is D");
    }

}