/**
 *
 * @author estefaniapitolmartinez
 */
public class Icy extends Enchantment {
    public Icy(Weapon w) {
        this.weapon = w;
        this.description = w.getDescription();
    }

    public String getDamage() {
        return weapon.getDamage() + " + Icy enchantment damage";
    }
}