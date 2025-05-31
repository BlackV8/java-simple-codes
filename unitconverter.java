import java.util.Scanner;

public class unitconverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HERE IS TABLE OF CONVERSIONS AVAILABLE. \nALL ARE VICE VERSA\n1. km to m\n2. cm to m\n3. kg to g\n4. cm to feet\n5. C to F");
        System.out.println("Please enter value to convert:");
        float num = scan.nextFloat();
        scan.nextLine();
        System.out.println("Unit to be converted to (km/m/cm/kg/g/feet/C/F):");
        String tbc = scan.nextLine().toLowerCase();

        switch (tbc) {
            case "km":
                System.out.println("Meters: " + num * 1000);
                break;
            case "m":
                System.out.println("From km: " + num / 1000);
                System.out.println("From cm: " + num / 100);
                break;
            case "cm":
                System.out.println("Meters: " + num / 100);
                System.out.println("Feet: " + num / 30.48);
                break;
            case "kg":
                System.out.println("Grams: " + num * 1000);
                break;
            case "g":
                System.out.println("Kilograms: " + num / 1000);
                break;
            case "feet":
                System.out.println("Centimeters: " + num * 30.48);
                break;
            case "f":
                System.out.println("Fahrenheit: " + ((num * 9 / 5) + 32));
                break;
            case "c":
                System.out.println("Celsius: " + ((num - 32) * 5 / 9));
                break;
            default:
                System.out.println("Error: unit not found");
                break;
        }

        scan.close();
    }
}
