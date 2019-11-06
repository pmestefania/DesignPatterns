public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public float area() {
        System.out.println("Area of the Square");
        return 0.0f;
    }

    @Override
    public float perimeter() {
        System.out.println("Perimeter of the Square");
        return 0.0f;
    }
}