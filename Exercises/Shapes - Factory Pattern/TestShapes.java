public class TestShapes {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(args[0]);

        shape.draw();
        shape.area();
        shape.perimeter();
    
        /*
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(args[0]);

        shape.draw();
        shape.area();
        shape.perimeter();
        */

        /*
        Shape shape;
        int shapeType = Integer.parseInt(args[0]);

        if(shapeType == 0)
            shape = new Circle();
        else if(shapeType == 1)
            shape = new Square();
        else
            shape = new Rectangle();

        shape.draw();
        shape.area();
        shape.perimeter();
        */

        /*
        Shape circle = new Circle();
        Shape sqaure = new Square();
        Shape rectangle = new Rectangle();

        circle.draw();
        square.draw();
        rectangle.draw();
        */
    }
}