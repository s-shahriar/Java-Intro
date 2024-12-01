package Lambda;

//Lambda Rules:
//1) variables should be of interface type
//2) lambda expressions should have the same amount of parameters and same return types as that of the method in that interface

interface StringExample{
    String reverse(String x);
}

public class Example {
    public static void main(String[] args){

        // lambda function starts here - StringExample result = new StringExample()
        StringExample result = (str) -> {
            String c1= "";
            for (int i = str.length() - 1; i >= 0; i--){
                c1=c1+str.charAt(i);
                System.out.println(c1);
            }
            return c1;
        };

        // Now use this Lambda Function
        System.out.println(result.reverse("Hello"));
    }
}
