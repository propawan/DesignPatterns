package SingletonPattern;

public class LoggerSingleton {
    private static LoggerSingleton instance = null;

    private LoggerSingleton(){

    }

    public static LoggerSingleton getInstance(){
        if(instance == null){
            instance = new LoggerSingleton();
        }
        return instance;
    }
}
