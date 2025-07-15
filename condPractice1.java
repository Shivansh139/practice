import java.util.Scanner;

public class condPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;
        System.out.println("physic");
        m1 = sc.nextByte();
        System.out.println("chemistry");
        m2 = sc.nextByte();
        System.out.println("maths");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        if(avg>40 && m1>33 && m2>33 && m3>33 ) {
            System.out.println("pass");
        }
            else{
                System.out.println("fail");
            }


    }
}
