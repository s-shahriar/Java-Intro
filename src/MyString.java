import java.util.Locale;

public class MyString {
    public static void main(String[] args){
        String s1 = "Cat";
        String s2 = new String("Dog");
        String s3 = "Cat";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s2));
        System.out.println(s1.contains("c"));
        System.out.print("==========");

        String str = "Today is Monday";

        System.out.println(str.toLowerCase());
        System.out.println(str.replace("Monday", "Sunday"));
    }
}
