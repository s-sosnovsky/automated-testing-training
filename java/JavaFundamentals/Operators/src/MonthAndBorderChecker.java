import java.util.Scanner;

/**
 * Created by Sery on 13.02.2019.
 */
public class MonthAndBorderChecker {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkMonth();
        checkBorders();
        closeInputStream(scanner);
    }

    private static void checkMonth() {
        System.out.println("Enter number of your month (from 1 to 12)");
        int monthIndex = scanner.nextInt();
        String[] monthsOfYear = {"january", "february", "march", "april",
                "may", "june", "july", "august", "september",
                "october", "november", "december"};
        try {
            System.out.println("Your month is - " + monthsOfYear[monthIndex - 1] + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are only 12 months in the year. Please Enter a number from 1 to 12");
            System.out.println("Your month is - " + monthsOfYear[monthIndex - 1] + ".");
        }
    }

    private static void checkBorders() {
        int numberForCheck;
        int lowerBorder;
        int higherBorder;

        System.out.println("Enter number");
        numberForCheck = scanner.nextInt();
        System.out.println("Enter lower border");
        lowerBorder = scanner.nextInt();
        System.out.println("Enter higher border");
        higherBorder = scanner.nextInt();

        if ((numberForCheck>lowerBorder) && (numberForCheck<higherBorder)){
            System.out.println("Number belongs to (n,m) interval");
        }
        if ((numberForCheck>=lowerBorder) && (numberForCheck<=higherBorder)){
            System.out.println("Number belongs to [n,m] interval");
        }
        if ((numberForCheck>lowerBorder) && (numberForCheck<=higherBorder)){
            System.out.println("Number belongs to(n,m] interval");
        }
        if ((numberForCheck>=lowerBorder) && (numberForCheck<higherBorder)){
            System.out.println("Number belongs to [n,m) interval");
        }
        if ((numberForCheck<lowerBorder) || (numberForCheck>higherBorder)) {
            System.out.println("Number is out of borders");
        }
    }

    private static void closeInputStream(Scanner scanner){
        if(scanner != null){
            scanner.close();
        }
    }
}

