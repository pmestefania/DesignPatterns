public class ShapeFactory {
    public Shape createShape(String shapeType) {
        Shape shape = null;
        if(shapeType.equals("0"))
            shape = new Circle();
        else if(shapeType.equals("1"))
            shape = new Square();
        else
            shape = new Rectangle();
        return shape;
    }
}