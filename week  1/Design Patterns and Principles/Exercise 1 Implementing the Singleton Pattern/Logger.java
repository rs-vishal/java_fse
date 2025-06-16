public class Logger {

    //Private static instance of Logger (Eager Initialization)
    private  static Logger instance = new Logger();

    private Logger() {
        System.out.println("Logger initialized");
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }

    
}
