/**
 *
 * @author estefaniapitolmartinez
 */
public class Sword extends Weapon {
    public Sword() {
        this.description = "Sword";
    }

    @Override
    public String getDamage() {
        return "Sword damage";
    }
}