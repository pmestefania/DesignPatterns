/**
 *
 * @author estefaniapitolmartinez
 */
public abstract class Beverage {
    private String description;

    public String getDescription() {
        return this.description;
    }

    public abstract Double cost();
}