import java.util.Scanner;

public class condpractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary;
        System.out.println("write your yearly income");
        salary = sc.nextInt();
        System.out.println("your income "+ salary);
        if(salary <= 500000 && salary >= 250000){
            float tax = 0.05f*salary;
            System.out.println("your tax " + tax);

        }
        else if(salary <= 100000 && salary >= 500000){
            float tax = 0.20f*salary;
            System.out.println("your tax " + tax);
        }
        else if(salary >= 1000000){
            float tax = 0.30f*salary;
            System.out.println("your tax " + tax );
        }
        else{
            System.out.println("you don't earn enough");
        }


    }
}
