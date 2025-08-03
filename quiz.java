import java.util.Scanner;

public class quiz {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("HERE ARE YOUR ULTIMATE CAR KNOWLEDGE QUIZ TEST");
        System.out.println("==============================================");
        System.out.println("THERE WILL BE 5 QUESTIONS AND WILL CONTAIN POINTS ACCORDINGLY");
        System.out.println("=============================================================");
        System.out.println("ARE YOU READY TO TURN THE CRANKSHAFT GET IT SPINNING ???");
        String ready = sc.nextLine();
        if (ready.equals("yes")){
            System.out.println("OK !! HERES YOUR FIRST QUESTION");
        }
        else {
            System.out.println("OK (SISSY!!)");
        }
        if (ready.equals("yes")){
            Thread.sleep(1000);
            System.out.println("WHAT IS THE NAME OF THE COMPONENT THAT SYNCHRONIZES THE SPNNING OF THE CRANKSHAFT AND CAMSHAFT??");
            String ans1 = sc.nextLine();
            if (ans1.equals("timing belt")){
                score = score + 5;
                System.out.println("LETS GOOO!! YOU GOT THIS CORRECT");
                System.out.println("YOUR SCORE IS " + score);
            }
            else {
                System.out.println("SORRY!! LOOKS LIKE YOU'LL NEED DIAPERS THIS SEASON!!");
            }
            System.out.println("OK !! HERES YOUR NEXT QUESTION. TIME TO LEVEL UP!!");
            Thread.sleep(1000);
            System.out.println("WHAT IS THE NAME OF THE COMPONENT THAT SPRAYS FUEL INTO THE VALVES ??");
            String ans2 = sc.nextLine();
            if (ans2.equals("fuel injector")){
                System.out.println("LETS GOOO!! ANOTHER ONE DEMOLISHED!!");
                score = score + 5;
                System.out.println("YOUR NEW SCORE IS " + score);
            }
            else {
                System.out.println("LAMEE MAN !! THIS WAS EAASYYY!!");
            }
            System.out.println("OK !! HERES YOURE NEXT QUESTION");
            System.out.println("WHAT IS THE NAME OF THE VALVE THAT SUCKS IN THE AIR IN THE PISTONS");
            String ans3 = sc.nextLine();
            if (ans3.equals("intake valve")){
                System.out.println("YESSSS!! 3 IN A ROWW!! IMPRESSIVE !!");
                score = score + 5;
                System.out.println("YOUR NEW SCORE IS " + score);
            }
            else {
                System.out.println("LOSERRR !!");
            }
            System.out.println("OK HERE IS THE LAST QUESTION FOR THE DAY!!");
            System.out.println("NAME ANY FORCED INDUCTION SYSTEM THAT HELPS BOOST THE OVERALL SPEED AND PERFORMANCE");
            String ans4 = sc.nextLine();
            switch (ans4) {
                case "turbocharger" :
                    System.out.println("OK, WILL DO. ACED THIS ONE!!");
                    score = score + 5;
                    System.out.println("YOUR NEW SCORE IS " + score);
                    break;
                case "supercharger" :
                    System.out.println("OK, WILL DO. ACED THIS ONE!!");
                    score = score + 5;
                    System.out.println("YOUR NEW SCORE IS " + score);
                    break;
                case "nitrous oxide" :
                    System.out.println("OK, WILL DO. ACED THIS ONE!!");
                    score = score + 5;
                    System.out.println("YOUR NEW SCORE IS " + score);
                    break;
                default :
                    System.out.println("NAHH BRUV!! WONT WORK HERE!! SORRY");
                    System.out.println("YOUR SCORE IS " + score);
                    break;
            }
        }
        System.out.println("THANK YOU FOR TAKING THE TEST AND PROVING YOUR CAR KNOWLEDGE!!");
    sc.close();
    }
}   

