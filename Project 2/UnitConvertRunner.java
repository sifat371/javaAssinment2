import java.util.Scanner;

public class UnitConvertRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("from which unit you want to convert( oz, lb, in, ft, mi): ");
        String fromConvert = in.next();



        System.out.print("to which unit you want to be converted(g, kg, mm, cm, m, km): ");
        String toConvert = in.next();

        // Enter the value
        System.out.print("Enter the value of "+ fromConvert + ": ");
        double value = in.nextDouble();

        UnitConvert unitConvert = new UnitConvert(fromConvert,toConvert,value);

        System.out.println("The converted value from "+fromConvert+" to "+toConvert+" is :"+unitConvert.getResult());

    }

}
