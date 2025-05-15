import java.util.Scanner;

public class Garage {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("              WELCOME TO KP'S GARAGE");
        System.out.println("=====================================================");
        System.out.println("ENTER THE FOLLOWING DETAILS TO ADD YOUR CAR TO GARAGE");
        System.out.println("=====================================================");

        System.out.println("HORSEPOWER??");
        Long hp = scan.nextLong();
        scan.nextLine();

        if (hp >= 500) {
            System.out.println("NICE RIDE. IT'S POWERFUL!!");
        } else {
            System.out.println("SORRY SIR, LEMONS ARE NOT ALLOWED");
            return;
        }

        System.out.println("CAR BRAND AND MODEL??");
        String brand = scan.nextLine();

        // Regular Membership Brands
        if (brand.equals("BMW") || brand.equals("AUDI") || brand.equals("TOYOTA") || brand.equals("FORD")) {
            System.out.println("GREAT JOB ON GETTING THE MEMBERSHIP OF KP GARAGES");
        }

        System.out.println("LICENSE NUMBER??");
        String num = scan.nextLine();

        // VIP Brands
        if (brand.equals("LAMBORGHINI") || brand.equals("FERRARI") || brand.equals("BUGGATI")
                || brand.equals("KOENIGSEGG") || brand.equals("MCLAREN")) {
            System.out.println("GREAT JOB ON GETTING THE V.I.P MEMBERSHIP OF KP GARAGES");
        }

        System.out.println("YOUR CODE/PASS FOR ENTRY IN THE GARAGES IS AS FOLLOWS");
        System.out.println(brand + num + "4529");

        scan.close();
    }
}
