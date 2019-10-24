/**
 *
 * @author estefaniapitolmartinez
 */
public class VerticalScroll extends WindowDecorator {
    public VerticalScroll(Window w) {
        this.window = w;
    }

    @Override
    public String description() {
        return window.description() + "- a Vertical Scroll\n";
    }
}