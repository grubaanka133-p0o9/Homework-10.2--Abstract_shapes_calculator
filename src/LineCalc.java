public class LineCalc {
    double lineLength(Line2D line){
        return Math.sqrt(Math.pow(line.getStart_x() - line.getEnd_x(), 2) + Math.pow(line.getStart_y()
                - line.getEnd_y(), 2));
    }
}
