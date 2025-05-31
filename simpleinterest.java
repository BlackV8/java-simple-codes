import java.util.Scanner;
public class simpleinterest {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO SIMPLE INTEREST CALCULATOR");
        System.out.println("PLEASE ENTER DETAILS AS FOLLOWS");
        System.out.println("please enter principal amount");
        float p = scan.nextFloat();
        System.out.println("please enter rate of interest(per annum)");
        float rate = scan.nextFloat();
        System.out.println("please enter time period of loan");
        float t = scan.nextFloat();
        float si = (p*rate*t)/100;
        System.out.println("your simple interest is ₹" + si);
        scan.close();
    }
}
