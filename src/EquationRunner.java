import java.util.Scanner;
import java.text.DecimalFormat;


public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter your first coordinate pair as (x1,y1): ");
        String firstCoord = s.nextLine();
        double x = Double.parseDouble(firstCoord.substring(1, firstCoord.indexOf(", ")));
        double y = Double.parseDouble(firstCoord.substring(firstCoord.indexOf(", ") + 2, firstCoord.length()-1));

        System.out.println("Enter your second coordinate pair as (x2,y2): ");
        String secondCoord = s.nextLine();
        double x2 = Double.parseDouble(secondCoord.substring(1, secondCoord.indexOf(", ")));
        double y2 = Double.parseDouble(secondCoord.substring(secondCoord.indexOf(", ") + 2, secondCoord.length()-1));

        LinearEquation equation = new LinearEquation(x, y, x2, y2);

        System.out.println(equation.getEquation());
        System.out.println("First pair: (" + x + ", " + y + ")");
        System.out.println("Second pair: (" + x2 + ", " + y2 + ")");
        System.out.println("Slope of line: " + equation.getSlope());
        System.out.println("Y-intercept: " + equation.getYIntercept());
        System.out.println("Distance between points: " + equation.getDistance());

        System.out.println("Enter a third x-value: ");
        int x3 = s.nextInt();
        System.out.println("Solved coordinate point is: " + "(" + x3 + ", " + df.format(equation.calculateY(x3)) + ")");;

    }
}
