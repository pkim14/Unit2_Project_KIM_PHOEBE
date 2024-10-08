import java.text.DecimalFormat;

public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private int slopeNum;
    private int slopeDen;
    private double yIntercept;
    private DecimalFormat df = new DecimalFormat("0.00");

    public LinearEquation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        // Calculates slope as a fraction
        this.slopeNum = (int)(y2 - y1);
        this.slopeDen = (int)(x2 - x1);
        this.yIntercept = Math.round((y1 - (getSlope() * x1) * 100.0)) / 100.0;
    }


    public String getEquation() {
        String slopeString;

        // Checks if the slope is an integer or a fraction
        if (slopeNum % slopeDen == 0){
            // If divisible, it's an integer
            slopeString = String.valueOf(slopeNum / slopeDen);
        }
        else{
            // If not divisible, keep it as s fraction
            slopeString = slopeNum + "/" + slopeDen;
        }
        return "y = " + slopeString + "x + " + df.format(yIntercept);
    }

    public double getDistance() {
        return Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) * 100.0) / 100.0;
    }

    public double calculateY(double x1) {
        return (getSlope() * x1) + yIntercept;
    }

    public double getSlope() {
        return (double) slopeNum / slopeDen;
    }

    public double getYIntercept() {
        return yIntercept;
    }
}









































