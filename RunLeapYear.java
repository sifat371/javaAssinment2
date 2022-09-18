import java.util.Scanner;

public class RunLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int inYear = in.nextInt();
        LeapYear year = new LeapYear(inYear);
        if (year.getbool()){
            System.out.println(year.getYear() + " is a leap year");
        } else System.out.println(year.getYear() + " is not a leap year");

    }
}
