/**
 *
 * @author estefaniapitolmartinez
 */
public class Paralysis extends ChangedState {
    public Paralysis(Weapon w) {
        this.weapon = w;
        this.description = w.getDescription();
    }

    public String getDamage() {
        return weapon.getDamage() + " + Paralysis changed state damage";
    }
}