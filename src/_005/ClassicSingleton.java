package _005;

// not thread safe
public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;
    private ClassicSingleton() {} // so only this class can instantiate

    public static ClassicSingleton getInstance() { // classic singleton
        if(uniqueInstance == null) uniqueInstance = new ClassicSingleton();
        return uniqueInstance;
    }

    /**
    public static synchronized  ClassicSingleton getInstance() { // but now it blocks every getInstance call
        if(uniqueInstance == null) uniqueInstance = new ClassicSingleton();
        return uniqueInstance;
    }
     */

    /**
    private static ClassicSingleton uniqueInstance = new ClassicSingleton();
     // eager singleton instead of lazy one for non-resource intensive
     // JVM guarantees the instance will be created before any thread accesses the static uniqueInstance variable
     */

    /**
     // The volatile keyword ??? why
    private volatile static ClassicSingleton uniqueInstance;

    public static ClassicSingleton getInstance2() {
        if(uniqueInstance == null) {
        // With double-checked locking, we first check to see if an instance is created,
        // and if not, THEN we synchronize. This way, we only synchronize the first time through, just what we want.
            synchronized (ClassicSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ClassicSingleton();
                }
            }
        }
        return uniqueInstance;
    }
     */

    public String getDescription() {
        return "This is a classic singleton";
    }

}
