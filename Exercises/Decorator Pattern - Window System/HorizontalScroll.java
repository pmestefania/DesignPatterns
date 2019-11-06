/**
 *
 * @author estefaniapitolmartinez
 */
public class HorizontalScroll extends WindowDecorator {
    public HorizontalScroll(Window w) {
        this.window = w;
    }

    @Override
    public String description() {
        return window.description() + "- a Horizontal Scroll\n";
    }
}