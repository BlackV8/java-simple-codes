
import java.util.Scanner;

public class whileven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        System.out.println("NETER NUMBER TILL WHICH EVEN NUM IS TO BE FOUND");
        int limit = sc.nextInt();
        while (num <= limit) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
        sc.close();
    }
}
