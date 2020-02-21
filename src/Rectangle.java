public class Rectangle extends GeometricShape {
    private double side_A;
    private double side_B;

    public Rectangle(double side_A, double side_B) {
        this.side_A = side_A;
        this.side_B = side_B;
    }

    public double getSide_A() {
        return side_A;
    }

    public double getSide_B() {
        return side_B;
    }
}
