public class TestChocolateBoiler {
	public static void main(String args[]) {
		SingletonChocolateBoiler boiler = SingletonChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
        SingletonChocolateBoiler boiler2 = SingletonChocolateBoiler.getInstance();
        
        System.out.println(boiler);
        System.out.println(boiler2);
	}
}