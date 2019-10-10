/**
 *
 * @author estefaniapitolmartinez
 */
public class LineColorDecorator extends ShapeDecorator {
    private Color color;

    public LineColorDecorator(Shape s, Color c) {
        this.shape = s;
        this.color = c;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line color: " + color.toString());
    }

    @Override
    public void resize() {
        shape.resize();
        System.out.println("Line color: " + color.toString());
    }

    @Override
    public String description() {
        return shape.description() + "\nLine color: " + color.toString() + "\n";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}