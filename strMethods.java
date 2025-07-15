import java.sql.SQLOutput;
import java.util.Locale;

public class strMethods {
    public static void main(String[] args) {
         String a = "    hello shivansh       ";
        // String b = a.trim();
        System.out.println(a);
        //trim spaces
        String b = a.trim();
        System.out.println(b);
        // substring
        System.out.println(a.substring(8));
        System.out.println(a.substring(8,12));

        System.out.println(a.replace("shivansh","pranay"));
        System.out.println(b.startsWith("hello"));
        System.out.println(b.endsWith("vansh"));
        System.out.println(b.charAt(6));
        System.out.println(b.length());
          System.out.println(b.indexOf("s",7));
          //to write double quote inside print we have to use backslash (escape sequence character)
        System.out.println("hello \" shivansh \"");
        System.out.println(b.replace(" ","_"));

    }
}
