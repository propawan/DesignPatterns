package SingletonPattern;

public class SingletonDemo {
    public static void main(String[] args) {
        LoggerSingleton loggerSingleton = LoggerSingleton.getInstance();
        System.out.println(loggerSingleton);

        LoggerSingleton loggerSingleton2 = LoggerSingleton.getInstance();
        System.out.println(loggerSingleton2);

        LoggerSingletonThreadSafe threadSafe = LoggerSingletonThreadSafe.getInstance();
        System.out.println(threadSafe);

        System.out.println("Cherry-pick test 3");
        System.out.println("Cherry-pick test 2");
        System.out.println("Cherry-pick test");
        System.out.println("Singleton pattern");
    }
}
