import java.util.Scanner;

public class percentCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        for(int i = 0; i<5;i++){
            System.out.println("write your marks");
            marks[i] = input.nextInt();
            sum += marks[i];
        }
         double percentage = (sum/500.0)*100;;
            System.out.println(sum + "  " + percentage);


    }
}
