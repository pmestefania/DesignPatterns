/**
 *
 * @author estefaniapitolmartinez
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso description";
    }

    @Override
    public String cost() {
        return "Espresso price";
    }
}