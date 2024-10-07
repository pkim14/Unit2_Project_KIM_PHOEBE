import java.text.DecimalFormat;

public class LinearEquation {
    private double x;
    private double y;
    private double x2;
    private double y2;
    private double slope, yIntercept;
//    private DecimalFormat df = new DecimalFormat("0.00");

    public LinearEquation(double x, double y, double x2, double y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.slope = (y2 - y) / (x2 - x);
        this.yIntercept = Math.round((y - (slope * x) * 100)) / 100;
    }


    public String getEquation() {
        return "y = " + slope + "x + " + yIntercept;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public double calculateY(double x) {
        return (slope * x) + yIntercept;
    }

    public double getSlope() {
        return slope;
    }

    public double getYIntercept() {
        return yIntercept;
    }
}









































