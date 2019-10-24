public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public float area() {
        System.out.println("Area of the Circle");
        return 0.0f;
    }

    @Override
    public float perimeter() {
        System.out.println("Perimeter of the Circle");
        return 0.0f;
    }
}