/**
 *
 * @author estefaniapitolmartinez
 */
public class LineThinknessDecorator extends ShapeDecorator {
    private Double thickness;

    public LineThinknessDecorator(Shape s, Double t) {
        this.shape = s;
        this.thickness = t;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line thickness: " + thickness);
    }

    @Override
    public void resize() {
        shape.resize();
        System.out.println("Line thickness: " + thickness);
    }

    @Override
    public String description() {
        return shape.description() + "\nLine thickness: " + thickness + "\n";
    }

    @Override
    public boolean isHide() {
        return shape.isHide();
    }
}