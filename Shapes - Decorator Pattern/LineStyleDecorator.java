/**
 *
 * @author estefaniapitolmartinez
 */
public class LineStyleDecorator extends ShapeDecorator {
    private LineStyle lineStyle;

    public LineStyleDecorator(Shape s, LineStyle ls) {
        this.shape = s;
        this.lineStyle = ls;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line style: " + lineStyle);
    }

    @Override
    public void resize() {
        shape.resize();
        System.out.println("Line style: " + lineStyle);
    }

    @Override
    public String description() {
        return shape.description() + "\nLine style: " + lineStyle + "\n";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}