/**
 *
 * @author estefaniapitolmartinez
 */
public class Poisoning extends ChangedState {
    public Poisoning(Weapon w) {
        this.weapon = w;
        this.description = w.getDescription();
    }

    public String getDamage() {
        return weapon.getDamage() + " + Poisoning changed state damage";
    }
}