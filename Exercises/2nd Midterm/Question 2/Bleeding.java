/**
 *
 * @author estefaniapitolmartinez
 */
public class Bleeding extends ChangedState {
    public Bleeding(Weapon w) {
        this.weapon = w;
        this.description = w.getDescription();
    }

    public String getDamage() {
        return weapon.getDamage() + " + Bleeding changed state damage";
    }
}