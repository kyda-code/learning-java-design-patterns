package learning;

/**
 * The SingletonHolder class provides a thread-safe implementation of the singleton design pattern using the
 * Initialization-on-demand holder idiom.
 *
 * This class cannot be instantiated directly. To obtain the singleton instance, use the static method
 * {@link #getInstance()}.
 */
public class SingletonHolder {

    private SingletonHolder() {
        // private constructor
    }

    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

}
