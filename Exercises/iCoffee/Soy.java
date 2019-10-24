/**
 *
 * @author estefaniapitolmartinez
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage b) {
        this.beverage = b;
        this.description = b.getDescription();
    }

    public String cost() {
        return beverage.cost() + " + Soy cost";
    }
}