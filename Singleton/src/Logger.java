public class Logger {
    // The private instance is created so that it will not be accessed anywhere outside the class
    private  static Logger logger;


    // The constructor is private to prevent creating new instances
    // of the class using the new keyword from outside the class.
    private Logger(){
    }

    // This is the lazy initialization of the logger instance and is created when needed
    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message){
        System.out.println(message);
    }
}
