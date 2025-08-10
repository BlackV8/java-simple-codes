import java.util.Scanner;

public class guessnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE SELECT DIFFICULTY LEVEL TO GUESS NUMBER");
        System.out.println("EASY: WITHIN 10");
        System.out.println("MID: WITHIN 15");
        System.out.println("HARD: WITHIN 20");
        System.out.println("IMPOSSIBLE: 50");
        System.out.println("ARJUNA: 100");
        String level = sc.nextLine();

        switch (level.toUpperCase()) {
            case "EASY":
                System.out.println("LOOSER!!");
                break;
            case "MID":
                System.out.println("OK!! LOOKS LIKE YOUR TRYNA PROVE YOURSELF......UNWORTHY!!");
                break;
            case "HARD":
                System.out.println("YOU NEED GUTS TO TAKE THAT ON!!");
                break;
            case "IMPOSSIBLE":
                System.out.println("HO HO HO!!! NOW YOU'RE TALKING!!");
                break;
            case "ARJUNA":
                System.out.println("NA HO PAAYEGA TUMSE.... AUKAT KE BAHAR HAI!!");
                break;
            default:
                System.out.println("INVALID CHOICE!");
                return;
        }

        if (level.equals("EASY")) {
            int num1 = (int) (Math.random() * 10);
            System.out.println("GUESS NUMBER FROM 0 TO 10");
            int guess = sc.nextInt();
            if (guess == num1) {
                System.out.println("OK YOU GOT THAT RIGHT!! NICE");
            } else {
                System.out.println("MAN!! YOU NEED A PAIR TO MISS THAT");
            }
        } else if (level.equals("MID")) {
            int num1 = (int) (Math.random() * 15);
            System.out.println("GUESS NUMBER FROM 0 TO 15");
            int guess = sc.nextInt();
            if (guess == num1) {
                System.out.println("DAMN!! YOU NAILED IT!!");
            } else {
                System.out.println("HAHA!! YOU MISSED BY MILES!!");
            }
        } else if (level.equals("HARD")) {
            int num1 = (int) (Math.random() * 20);
            System.out.println("GUESS NUMBER FROM 0 TO 20");
            int guess = sc.nextInt();
            if (guess == num1) {
                System.out.println("LEGENDARY MOVE!!");
            } else {
                System.out.println("OOF!! TOO BAD... TRY HARDER!!");
            }
        } else if (level.equals("IMPOSSIBLE")) {
            int num1 = (int) (Math.random() * 50);
            System.out.println("GUESS NUMBER FROM 0 TO 50");
            int guess = sc.nextInt();
            if (guess == num1) {
                System.out.println("IMPOSSIBLE? NOT FOR YOU!!");
            } else {
                System.out.println("HAHA!! AS EXPECTED... FAILED!!");
            }
        } else if (level.equals("ARJUNA")) {
            int num1 = (int) (Math.random() * 100);
            System.out.println("GUESS NUMBER FROM 0 TO 100");
            int guess = sc.nextInt();
            if (guess == num1) {
                System.out.println("YOU ARE THE TRUE ARJUNA!! RESPECT!!");
            } else {
                System.out.println("TOLD YA... OUT OF YOUR LEAGUE!!");
            }
        }

        sc.close();
    }
}
