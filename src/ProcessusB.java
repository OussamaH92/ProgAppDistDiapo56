public class ProcessusB extends Thread{

    private Token t = new Token();

    public ProcessusB(Token t) {
        this.t = t;
    }

    @Override
    public void run(){
        t.isDoneA();
        B();
        t.jobDoneB();
        D();
        t.jobDoneD();
        t.isDoneE();
        F();
    }

    private void B(){
        System.out.println("Tache B");
    }

    private void D(){
        System.out.println("Tache D");
    }

    private void F(){
        System.out.println("Tache F");
    }
}
