class OuterClass {
    int x = 10;

    class InnerClass {
        int y =5;
        public int innerMethod(){
            return x;
        }
    }
}


public class Main {
    public static void main(String[] args){
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();
        System.out.println(in.innerMethod());
        System.out.println(out.x - in.y);
    }
}


