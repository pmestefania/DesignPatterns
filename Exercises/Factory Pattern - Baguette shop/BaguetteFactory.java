/**
 *
 * @author estefaniapitolmartinez
 */
public abstract class BaguetteFactory {
    protected String name;

    public Baguette create(int option) {
        System.out.println("Creating baguette in " + name + ".");
        Baguette baguette = null;
        switch(option) {
            case 1 : baguette = new SpanishBaguette(); break;
            case 2 : baguette = new ItalianBaguette(); break;
            case 3 : baguette = new MexicanBaguette(); break;
            case 4 : baguette = new RomanBaguette(); break;
        }
        return baguette;
    }

    public void name() {
        System.out.println(name);
    }
}