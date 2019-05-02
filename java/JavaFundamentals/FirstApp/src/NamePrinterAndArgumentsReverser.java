import java.util.Scanner;

/**
 * Created by Sery on 12.02.2019.
 */
public class NamePrinterAndArgumentsReverser {

    public static void main(String[] args) {
        reverseArgs(args);
        printName();
    }

    public static void printName() {
        System.out.println("Please, enter your name and press Enter:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name + "!!!");
        scan.close();
    }

    public static void reverseArgs(String[] argsToReverse){
        for( int i = argsToReverse.length - 1 ; i >= 0 ; i--)
            System.out.println("Argument " + (i+1) + ":   " + argsToReverse[i]);
    }
}
