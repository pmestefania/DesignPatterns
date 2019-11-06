public class VolatileChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static VolatileChocolateBoiler uniqueInstance;

    private LazyChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static VolatileChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            synchronized (VolatileChocolateBoiler.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new VolatileChocolateBoiler();
                }
            }
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