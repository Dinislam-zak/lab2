package singletone;
public class SingletoneExample {

    private static SingletoneExample instance;

    private SingletoneExample() {}

    public static SingletoneExample getInstance() {
        if (instance == null) {
            synchronized (SingletoneExample.class) {
                if (instance == null) {
                    instance = new SingletoneExample();
                }
            }
        }
        return instance;
    }

}