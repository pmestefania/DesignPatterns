/**
 *
 * @author estefaniapitolmartinez
 */
public class TestBeverage {
    public static void main(String args[]) {
        Beverage houseBlend = new Soy(new Milk(new HouseBlend()));
        Beverage darkRoast = new Mocha(new Whip(new DarkRoast()));
        Beverage espresso = new Milk(new Espresso());
        Beverage decaf = new Whip(new Decaf());

        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());
        System.out.println();

        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
        System.out.println();

        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
        System.out.println();

        System.out.println(decaf.getDescription());
        System.out.println(decaf.cost());
        System.out.println();
    }
}