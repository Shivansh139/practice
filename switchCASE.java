import java.util.Scanner;
//simple switch case calculator
public class switchCASE {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("type a");
        double a = m.nextDouble();
        System.out.println("type b");
        double b = m.nextDouble();
        System.out.println("write operator");
        char op = m.next().charAt(0);


        switch(op) {
            case '+':
                System.out.println("you chose addition");
                a+=b;
                System.out.println("result "+ a);
                break;

            case '*':
                System.out.println("you chose multiply");
                a*=b;
                System.out.println("result "+ a);
                break;

            case '/':
                System.out.println("you chose divide");
                a/=b;
                System.out.println("result "+ a);
                break;

            case '-':
                System.out.println("you chose -");
                a-=b;
                System.out.println("result "+ a);
                break;
            default:
                System.out.println("enter correct values");
        }
    }
}
