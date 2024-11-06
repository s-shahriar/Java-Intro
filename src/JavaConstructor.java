public class JavaConstructor {
    int a;
    int b;
    JavaConstructor(int a, int b){
        this.a = a; // a = 2-> not possible, because param a and int a are same. if param is used 'x','y', then a= x ok.
        this.b = b;
    }

    public static void main(String[] args){
        JavaConstructor j1 = new JavaConstructor(2,3);
        System.out.println(j1.a+" "+j1.b);
    }
}
