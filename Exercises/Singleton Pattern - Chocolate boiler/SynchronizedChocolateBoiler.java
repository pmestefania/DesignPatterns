public class SynchronizedChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static SynchronizedChocolateBoiler uniqueInstance;

    private SynchronizedChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized SynchronizedChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SynchronizedChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            // drain the boiled milk and chocolate
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}