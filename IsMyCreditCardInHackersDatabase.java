import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IsMyCreditCardInHackersDatabase {
    public static final String green = "\u001B[31m";
    public static final String reset = "\u001B[0m";
    public static void main(String[] args) {
        System.out.println(green+"Is My Credit Card In Hackers Database?"+reset);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Full Name: ");
        String Fname = sc.nextLine();
        System.out.println();
        System.out.print("Enter your card number:");
        int CardNum = sc.nextInt();
        System.out.println();
        System.out.print("Enter your card expiry date:");
        int CardExpiry = sc.nextInt();
        System.out.print("Enter CVV number: ");
        int CVV = sc.nextInt();
        System.out.println();
    }
}