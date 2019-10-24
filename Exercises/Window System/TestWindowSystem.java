/**
 *
 * @author estefaniapitolmartinez
 */
public class TestWindowSystem {
    public static void main(String args[]) {
        Window w1 = new Border(new VerticalScroll(new HorizontalScroll(new WindowWithFeatures())));
        Window w2 = new VerticalScroll(new HorizontalScroll(new WindowWithFeatures()));
        Window w3 = new HorizontalScroll(new WindowWithFeatures());

        System.out.println(w1.description() + "\n");
        System.out.println(w2.description() + "\n");
        System.out.println(w3.description() + "\n");
    }
}