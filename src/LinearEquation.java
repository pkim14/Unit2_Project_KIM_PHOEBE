public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;

    public LinearEquation(int x, int y, int x2, int y2){
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double Slope() {
        double slope = (y2-y)/(x2-x);
        return slope;
    }

    public double Intercept() {
//        double intercept = y- Slope();
//        return intercept;
    }

    public double Distance() {
        double distance = Math.sqrt(Math.pow(x2-x) + (y2-y));
        return distance;
    }
}

