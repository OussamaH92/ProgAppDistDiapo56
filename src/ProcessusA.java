public class ProcessusA extends Thread{

    private Token t = new Token();

    public ProcessusA(Token t) {
        this.t = t;
    }

    @Override
    public void run(){
        A();
        t.jobDoneA();
        t.isDoneB();
        C();
        t.isDoneD();
        E();
        t.jobDoneE();
    }

    private void A(){
        System.out.println("Tache A");
    }

    private void C(){
        System.out.println("Tache C");
    }

    private void E(){
        System.out.println("Tache E");
    }
}
