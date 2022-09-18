import java.util.Scanner;

public class TaxRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Use 1 if married else use 0 for declare unmarried
        System.out.println("Are your married(If Yes type ture & if no type false): ");
        boolean ismarried = in.nextBoolean();
        System.out.println("What is Your Income: ");
        int Money = in.nextInt();
        TaxPay taxPay = new TaxPay(ismarried,Money);
        System.out.println("Your tax is: " + taxPay.getTax());
    }
}
