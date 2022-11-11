package SingletonPattern;

public class LoggerSingletonThreadSafe {
    private static volatile LoggerSingletonThreadSafe instance = null;

    private LoggerSingletonThreadSafe(){
        if(instance != null){
            throw new RuntimeException("Please don't try to be smart");
        }
    }

    public static LoggerSingletonThreadSafe getInstance(){
        if(instance == null){
            synchronized (LoggerSingletonThreadSafe.class){
                if(instance == null){
                    instance = new LoggerSingletonThreadSafe();
                }
            }
        }

        return instance;
    }
}
