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
            // Initialize slope as an empty string
        String slopeString = "";
        String yInterceptString = "";

        // Checks if the slope is an integer or a fraction
        if (slopeNum % slopeDen == 0){
            // When the slope is a whole #
            int wholeSlope = slopeNum / slopeDen;
            if (wholeSlope == 1) {
                // Just returns x, when slope is 1
                slopeString = "";
            }
            else if (wholeSlope == -1) {
                slopeString = "-";
            }
            else {
                slopeString = String.valueOf(wholeSlope);
            }
        }
        else{
            // If slope is a fraction, handle the negative & positive cases
            if (slopeNum < 0) {
                if(slopeDen < 0) {
                    slopeNum = -slopeNum;
                    // Avoid double negatives
                    slopeDen = -slopeDen;
                }
            }
            else if (slopeDen < 0) {
                // Ensure only the numerator is negative
                slopeNum = -slopeNum;
                slopeDen = -slopeDen;
            }
            slopeString = slopeNum + "/" + slopeDen;
        }

        if (yIntercept == 0) {
            yInterceptString = "";
        }
        else if (yIntercept > 0) {
            yInterceptString = " + " + df.format(yIntercept);
        }
        else {
            yInterceptString = " - " + df.format(Math.abs(yIntercept));
        }
        if (slopeNum == 0 ) {
            if (yIntercept == 0) {
                return "y = 0";
            }
        return "y = " + df.format(yIntercept);

        }
        return "y = " + slopeString + "x + " + yInterceptString;
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









































