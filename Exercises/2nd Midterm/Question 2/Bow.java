/**
 *
 * @author estefaniapitolmartinez
 */
public class Bow extends Weapon {
    public Bow() {
        this.description = "Bow";
    }

    @Override
    public String getDamage() {
        return "Bow damage";
    }
}