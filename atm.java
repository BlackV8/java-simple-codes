import java.util.Scanner;
public class atm {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        long password = 1029384756;
        int totamt = 1000000;
        System.out.println("WELCOME TO BANK OF VSC");
        System.out.println("-----------------------");
        Thread.sleep(1000);
        System.out.println("PLEASE ENTER PASSWORD TO LOGIN TO BANK ACCOUNT");
        long trypass = sc.nextLong();
        if (trypass == password){
            System.out.println("OK !! LOGGED IN SUCCESSFULLY");
        }
        else if (trypass != password){
            System.out.println("SORRY !! PASSWORD INCORRECT");
            sc.close();
            return;
        }
        System.out.println("PLEASE ENTER THE FOLLOWING AS PER TO USE");
        System.out.println("[1] to check bank balance");
        System.out.println("[2] to deposit");
        System.out.println("[3] to withdraw");
        System.out.println("[0] to exit");
        int act = sc.nextInt();
        switch (act) {
            case 1:
                System.out.println("Your bank balance is $ " + totamt);
                break;
            case 2:
                System.out.println("Enter amount you want to deposit");
                int dep = sc.nextInt();
                int fintotamt = totamt + dep;
                System.out.println("Your new total bank balance is $ " + fintotamt);
                break;
            case 3:
                System.out.println("Enter number you want to withdraw");
                int withdraw = sc.nextInt();
                if (withdraw > totamt){
                    System.out.println("Amount needed to withdraw is more than the active bank balance. Please reform amount accordingly");
                }
                else {
                    int totamtnow = totamt - withdraw;
                    System.out.println("Your new bank balance is $ " + totamtnow);
                }
                break;
            case 0:
                System.out.println("Exiting. Thank you for using BANK OF VSC.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
        sc.close();
    }
}

