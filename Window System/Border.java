/**
 *
 * @author estefaniapitolmartinez
 */
public class Border extends WindowDecorator {
    public Border(Window w) {
        this.window = w;
    }

    @Override
    public String description() {
        return window.description() + "- a Border\n";
    }
}