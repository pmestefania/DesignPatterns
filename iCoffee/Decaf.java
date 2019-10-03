/**
 *
 * @author estefaniapitolmartinez
 */
public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf description";
    }

    @Override
    public String cost() {
        return "Decaf price";
    }
}