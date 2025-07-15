import java.util.Scanner;

public class conditionalSTART {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("type your age and gender to check if you are eligible to vote");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("gender");
            String gender = sc.nextLine();

        if(age >= 18 && gender.equals("male")) {
                System.out.println("eligible");
            }
//            else if(gender.equals("male")){
//            System.out.println(" ");
//        }
            else {
                System.out.println("no");
            }


    }
}
