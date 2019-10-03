/**
 *
 * @author estefaniapitolmartinez
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage b) {
        this.beverage = b;
        this.description = b.getDescription();
    }

    public String cost() {
        return beverage.cost() + " + Mocha cost";
    }
}