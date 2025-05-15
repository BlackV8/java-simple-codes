import java.util.Scanner;

public class admission {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("WELCOME TO KP GROUP OF UNIVERSITIES \n=================================== \nPLEASE ENTER YOUR DETAILS AS FOLLOWS \n====================================");
        
        System.out.println("NAME??");
        String name = scan.nextLine(); // reads your name
        
        System.out.println("AGE??"); // reads your age
        int age = scan.nextInt();
        scan.nextLine(); 
        
        if (age <= 19) { // checs if you are too young or not
            System.out.println("SORRY SIR STUDENTS BELOW 20 YEARS OF AGE ARE NOT ELIGIBLE");
        } 
        else {
        System.out.println("GREAT WORK YOU'RE ALREADY HALFWAY THROUGH");
        }   
        System.out.println("STREAM??"); // reads your stream
        String stream = scan.nextLine();
            
        if (stream.equals("science")) { // checks it if your stream is compatible or not
                System.out.println("CONGRATS YOU'RE ALMOST THERE!!");
        } 
        else {
                System.out.println("SORRY SIR ONLY SCIENCE IS ACCEPTED");
                scan.close();
                return;
        }

        System.out.println("MARKS GOT IN 10th??"); // reads your score in boards
        float min10 = scan.nextFloat();
            
        if (min10 >= 79.9) { // checks is that much marks is sufficient or not
                System.out.println("CONGRATULATIONS MASTER " + name + " YOU HAVE SUCCEEDED IN GETTING ADMISSION IN THE KP GROUP OF UNIVERSITIES");
        } 
        else {
                System.out.println("SORRY MISTER " + name + " YOUR RANK WAS NOT UP TO THE MARK. BETTER LUCK NEXT TIME");
        }
    }
}

