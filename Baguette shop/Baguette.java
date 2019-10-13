/**
 *
 * @author estefaniapitolmartinez
 */
public abstract class Baguette {
    protected String name;

    public Baguette order() {
        System.out.println("Ordering " + name + ".");
        prepare();
        bake();
        cut();
        box();
        return this;
    }

    public void prepare() {
        System.out.println("Preparing " + name + ".");
    }

    public void bake() {
        System.out.println("Baking " + name + ".");
    }

    public void cut() {
        System.out.println("Cutting " + name + ".");
    }

    public void box() {
        System.out.println("Boxing " + name + ".");
    }

    public void name() {
        System.out.println(name);
    }
}