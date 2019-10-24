/**
 *
 * @author estefaniapitolmartinez
 */
public class Igneous extends Enchantment {
    public Igneous(Weapon w) {
        this.weapon = w;
        this.description = w.getDescription();
    }

    public String getDamage() {
        return weapon.getDamage() + " + Igneous enchantment damage";
    }
}