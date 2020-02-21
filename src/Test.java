public class Test {
    public static void main(String[] args) {
        LineCalc lineCalc = new LineCalc();
        Line2D line2D = new Line2D(3,5,2,7);
        System.out.println("Section length: " + lineCalc.lineLength(line2D));

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Circle circleField = new Circle(4);
        System.out.println("Circle field: " + shapeCalculator.circleArea(circleField));

        Rectangle rectangleField = new Rectangle(7,4);
        System.out.println("Rectangle field: " + shapeCalculator.rectangleArea(rectangleField));

        Ball ballCapacity = new Ball(6);
        System.out.println("Ball capacity: " + shapeCalculator.ballVolume(ballCapacity));

        Cube cubeCapacity = new Cube(9);
        System.out.println("Cube capacity: " + shapeCalculator.cubeVolume(cubeCapacity));
    }
}
