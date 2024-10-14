
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Hello there!");
        Logger logger2 = Logger.getInstance();
        logger2.log("I am second instance");
        if(logger1 == logger2) System.out.println("We both are same");

        }

}