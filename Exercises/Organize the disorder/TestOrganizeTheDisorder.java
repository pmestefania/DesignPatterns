/**
 *
 * @author estefaniapitolmartinez
 */
public class TestOrganizeTheDisorder {
    public static void main(String args[]) {
        Character king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        king.showCharacter();

        System.out.println();

        Character queen = new Queen();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.showCharacter();

        System.out.println();

        Character knight = new Knight();
        knight.setWeaponBehavior(new SwordBehavior());
        knight.showCharacter();

        System.out.println();

        Character troll = new Troll();
        troll.setWeaponBehavior(new AxeBehavior());
        troll.showCharacter();
    }
}