public class Bank {
    class Account{
        public void printAccountName(){
            System.out.println("Bank Account");
        }
    }

    public void callingMethod(){
        Account a = new Account();
        a.printAccountName();
    }

    public void sum(int a,int b){
        int res = a*b;
        System.out.println("Result is = "+res);
    }

    public static void sumWithStatic(int a,int b){
        int res = a*b;
        System.out.println("Result is = "+res);
    }


    public static void main(String[] args){
        Student std = new Student("SSH", 25, 30);
        Bank b = new Bank();
        Bank.Account a = b.new Account();
        a.printAccountName();
        b.callingMethod();
        b.sum(4,5); // without static
        sumWithStatic(4,5); // with static
        std.showDetails();
    }

}
