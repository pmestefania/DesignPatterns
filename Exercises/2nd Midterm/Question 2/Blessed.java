/**
 *
 * @author estefaniapitolmartinez
 */
public class Blessed extends Enchantment {
    public Blessed(Weapon w) {
        this.weapon = w;
        this.description = w.getDescription();
    }

    public String getDamage() {
        return weapon.getDamage() + " + Blessed enchantment damage";
    }
}