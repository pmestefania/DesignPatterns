/**
 *
 * @author estefaniapitolmartinez
 */
public abstract class Character {
    protected WeaponBehavior weapon;

    public abstract void display();
    
    public void setWeaponBehavior(WeaponBehavior w){
        weapon = w;
    }
    
    public void fight(){
       weapon.useWeapon();
    }
    
    public void showCharacter(){
        display();
        fight();
    }
}