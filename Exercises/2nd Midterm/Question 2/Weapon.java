/**
 *
 * @author estefaniapitolmartinez
 */
public abstract class Weapon {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract String getDamage();
}