public class Line2D extends Shape2D {
    private double start_x;
    private double start_y;
    private double end_x;
    private double end_y;

    public Line2D(double start_x, double start_y, double end_x, double end_y) {
        this.start_x = start_x;
        this.start_y = start_y;
        this.end_x = end_x;
        this.end_y = end_y;
    }

    public double getStart_x() {
        return start_x;
    }

    public double getStart_y() {
        return start_y;
    }

    public double getEnd_x() {
        return end_x;
    }

    public double getEnd_y() {
        return end_y;
    }
}
