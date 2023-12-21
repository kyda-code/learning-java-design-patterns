package learning;

/**
 * The Singleton class implements the Singleton design pattern for lazy initialization.
 * Only one instance of Singleton can be created.
 */
// Singleton class opts for lazy initialization
public class Singleton {
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static Singleton instance;

    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        if (instance == null) {
            //synchronized block to remove overhead
            synchronized (Singleton.class) {
                if (instance == null) {
                    // if instance is null, initialize
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}