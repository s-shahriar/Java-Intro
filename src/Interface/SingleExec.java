package Interface;

interface SingleExec {
    void run();
    void start();
}

class GFG implements SingleExec {
    public void run(){
        System.out.print("Run");
    }

    public void start(){
        System.out.print("Start");
    }

    public static void main(String[] args){
        GFG gfg = new GFG();
        gfg.run();
        gfg.start();
    }
}
