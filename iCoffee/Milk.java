/**
 *
 * @author estefaniapitolmartinez
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage b) {
        this.beverage = b;
        this.description = b.getDescription();
    }

    public String cost() {
        return beverage.cost() + " + Milk cost";
    }
}