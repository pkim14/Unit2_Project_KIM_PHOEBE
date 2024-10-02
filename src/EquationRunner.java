import java.util.Scanner;
import java.text.DecimalFormat;


public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");



        System.out.println("Enter the x value of the first coordinate: ");
        int x1 = s.nextInt();
        System.out.println("Enter the y value of the first coordinate: ");
        int y1 = s.nextInt();

        System.out.println("Enter the x value of the second coordinate: ");
        int x2 = s.nextInt();
        System.out.println("Enter the y value of the second coordinate: ");
        int y2 = s.nextInt();

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

        System.out.println("First pair: (" + x1 + ", " + y1 + ")");
        System.out.println("Second pair: (" + x2 + ", " + y2 + ")");
        System.out.println("Slope of line: " + equation.getSlope());
        System.out.println("Y-intercept: " + equation.getYIntercept());
        System.out.println("Distance between points: " + equation.getDistance());

        System.out.println("Enter a third x-value: ");
        int x3 = s.nextInt();
        System.out.println("Solved coordinate point is: " + "(" + x3 + ", " + df.format(equation.calculateY(x3)) + ")");;

    }
}
