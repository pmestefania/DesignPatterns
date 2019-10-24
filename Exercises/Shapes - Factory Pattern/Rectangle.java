public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public float area() {
        System.out.println("Area of the Rectangle");
        return 0.0f;
    }

    @Override
    public float perimeter() {
        System.out.println("Perimeter of the Rectangle");
        return 0.0f;
    }
}