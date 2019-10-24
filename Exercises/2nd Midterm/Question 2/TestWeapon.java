/**
 *
 * @author estefaniapitolmartinez
 */
public class TestWeapon {
    public static void main(String args[]) {
        Weapon sword = new Poisoning(new Icy(new Sword()));
        Weapon spear = new Bleeding(new Igneous(new Spear()));
        Weapon bow = new Paralysis(new Blessed(new Bow()));

        System.out.println(sword.getDescription());
        System.out.println(sword.getDamage());
        System.out.println();

        System.out.println(spear.getDescription());
        System.out.println(spear.getDamage());
        System.out.println();

        System.out.println(bow.getDescription());
        System.out.println(bow.getDamage());
        System.out.println();
    }
}