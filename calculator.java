import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("If required operation is square root, floor, or ceiling, absolut please enter second number as 0");
        System.out.println("Enter first number:");
        double a = scan.nextDouble();

        System.out.println("Enter second number:");
        double b = scan.nextDouble();
        
        scan.nextLine(); 
        
        System.out.println("Enter operation (+, -, *, /, %, max, min, sqrt, floor, ceiling, absolute value, power):");
        String oper = scan.nextLine();

        switch (oper) {
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case "%":
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: division by zero");
                }
                break;
            case "min":
                System.out.println(Math.min(a,b));
                break;
            case "max":
                System.out.println(Math.max(a,b));
                break;
            case "square root":
                System.out.println(Math.sqrt(a));
                break;
            case "floor":
                System.out.println(Math.floor(a));
                break;
            case "ceiling":
                System.out.println(Math.ceil(a));
                break;
            case "absolute":
                System.out.println(Math.abs(a));
                break;
            case "power":
                System.out.println(Math.pow(a,b));
                break;
            default:
                System.out.println("Operation invalid");
                break;
        }
        
        scan.close();
    }
}
