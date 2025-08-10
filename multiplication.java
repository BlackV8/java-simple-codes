import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find multiplication table");
        int number = sc.nextInt();
        System.out.println("now enter till which number table is to be made");
        int limit = sc.nextInt();
        System.out.println("-----------------------------------------------");
        for (int i = 1; i <= limit; i++) {
            System.out.println(number * i);
        }
    }
}
