
import java.util.Scanner;
public class userinput {
    public static void main (String args[]) {
        System.out.println("input from user");
        Scanner sc = new Scanner (System.in);
        System.out.println("num 1");
        int a = sc.nextInt();
        System.out.println("enter num 2");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println(sum);




    }
}
