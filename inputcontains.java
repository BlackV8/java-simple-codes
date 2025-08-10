import java.util.Scanner;

public class inputcontains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your dream car here");
        String car = sc.nextLine();
        if (car.contains("b") && car.contains("m") && car.contains("w")) {
            System.out.println("sweeeet!!");
        } else {
            System.out.println("not as good as bmw");
        }
    }
}
