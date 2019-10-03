/**
 *
 * @author estefaniapitolmartinez
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage b) {
        this.beverage = b;
        this.description = b.getDescription();
    }

    public String cost() {
        return beverage.cost() + " + Whip cost";
    }
}