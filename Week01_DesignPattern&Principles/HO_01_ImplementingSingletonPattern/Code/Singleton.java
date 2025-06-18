public class Singleton {
    private static Singleton uniqueInstance;

    // Private constructor prevents instantiation from other classes
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a singleton!");
    }
}
