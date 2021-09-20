public class Token {

    private boolean AB,BC,DE,EF;

    public Token() {
       AB = false;
       BC = false;
       DE = false;
       EF = false;
    }

    public synchronized void jobDoneA(){
        AB=true;
        notify();
    }

    public synchronized void isDoneA(){
        while(!AB){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void jobDoneB(){
        BC=true;
        notify();
    }

    public synchronized void isDoneB(){
        while(!BC){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void jobDoneD(){
        DE=true;
        notify();
    }

    public synchronized void isDoneD(){
        while(!DE){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void jobDoneE(){
        EF=true;
        notify();
    }

    public synchronized void isDoneE(){
        while(!EF){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
