import java.util.Scanner;

public class ModCaseSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to hell modders");
        System.out.println("a place where Toyotas go in and Ferraris come out");
        System.out.println("What type of car are we looking at??");

        String car = scan.nextLine();
        switch (car) {
            case "sedan":
                System.out.println("Your maximum total price will be around $40,000");
                break;
            default:
                System.out.println("Sorry sir, car not recognized or we don't give service to that type of car");
                break;
        }

        System.out.println("Do you wish to add a turbocharger? ($10,000)");
        String turbo = scan.nextLine();
        if (turbo.equals("yes")) {
            System.out.println("Turbocharger worth $10,000 has been added to your car");
            System.out.println("Top speed has now been increased by 40 km/h");
        } else {
            System.out.println("Do you wish to add a supercharger? ($15,000)");
            String superc = scan.nextLine();
            if (superc.equals("yes")) {
                System.out.println("Supercharger worth $15,000 has been added to your car");
                System.out.println("Top speed has now been increased by 45 km/h");
            } else {
                System.out.println("Okay sir, no problem. Do you wish to equip a body kit?");
                String bkit = scan.nextLine();
                if (bkit.equals("yes")) {
                    System.out.println("Body kit 1 includes underglow lights, strip spoilers, extended front and back fenders, and hood scoops");
                    System.out.println("Body kit 2 includes extended spoilers, extended front and back fenders, roof scoops, and addon aftermarket rims");
                    System.out.println("Enter 1 or 2 to choose your body kit:");
                    int kit = scan.nextInt();
                    switch (kit) {
                        case 1:
                            System.out.println("Body kit 1! Nice choice. Your ride's gonna be glowing after this");
                            break;
                        case 2:
                            System.out.println("Okay sir, body kit 2 it is. I assure you people will be staring at your ride like it's made of gold");
                            break;
                        default:
                            System.out.println("Okay sir, I get it you're a performance dude not a looks one. Your beast is gonna be roaring");
                            break;
                    }
                }
            }
        }

        System.out.println("THANKS FOR COOPERATING WITH US AND MAKE SURE TO PAY US A VISIT AGAIN. MORE SERVICES COMING SOON!!");
        scan.close();
    }
}
