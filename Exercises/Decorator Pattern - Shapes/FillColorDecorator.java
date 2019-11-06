/**
 *
 * @author estefaniapitolmartinez
 */
public class FillColorDecorator extends ShapeDecorator {
    private Color color;

    public FillColorDecorator(Shape s, Color c) {
        this.shape = s;
        this.color = c;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Fill color: " + color.toString());
    }

    @Override
    public void resize() {
        shape.resize();
        System.out.println("Fill color: " + color.toString());
    }

    @Override
    public String description() {
        return shape.description() + "\nFill color: " + color.toString() + "\n";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}