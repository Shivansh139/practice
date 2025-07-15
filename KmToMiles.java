import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        float b = 1.609F;
        System.out.println("type km");
        Scanner sc = new Scanner(System.in);
                float a = sc.nextFloat();
        float miles = a/b;
        System.out.println(a + "km is " +miles+ "in miles"  );

    }
}
