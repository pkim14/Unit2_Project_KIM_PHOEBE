import java.text.DecimalFormat;

public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double slope, yIntercept;
    private DecimalFormat df = new DecimalFormat("0.00");

    public LinearEquation(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.slope = (y2 - y) / (x2 - x);
        this.yIntercept = y - (slope * x);
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









































