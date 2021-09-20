public class main {
    public static void main(String[] args) {

        Token t = new Token();

        ProcessusA p1 = new ProcessusA(t);
        ProcessusB p2 = new ProcessusB(t);

        p1.start();
        p2.start();

    }
}
