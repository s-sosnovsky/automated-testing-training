/**
 * Created by Sery on 12.02.2019.
 */

import java.util.Arrays;
import java.util.Scanner;

public class NumbersSorter {

   private static Integer[] arrayOfNumbers;

   public static void main(String[] args) {
        NumbersSorter.entryPoint();
    }

   private static void getNumbersFromConsole(){
        Scanner scanNumbers = new Scanner(System.in);
        System.out.println("Please, input the quantity of numbers:");
        int quantityOfNumbers = scanNumbers.nextInt();
        arrayOfNumbers = new Integer[quantityOfNumbers];
        System.out.println("Please, input numbers of different length, after every input press Enter:");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = scanNumbers.nextInt();
        }
        scanNumbers.close();
   }

    private static void printNumbers() {
        for (int number : arrayOfNumbers) {
            System.out.println(number);
        }
    }

    private static void findLongestNumber() {
        Integer maxLength = Integer.MIN_VALUE;
        Integer longestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
                if (maxLength < arrayOfNumbers[i].toString().length()) {
                    maxLength = arrayOfNumbers[i].toString().length();
                    longestNumber = arrayOfNumbers[i];
                }
            }
        System.out.println("The longest number " + longestNumber + " has maximum length " + maxLength + " chars");
        }

    private static void findShortestNumber(){
        Integer minLength = Integer.MAX_VALUE;
        Integer shortestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (minLength > arrayOfNumbers[i].toString().length())
            {
                minLength = arrayOfNumbers[i].toString().length();
                shortestNumber = arrayOfNumbers[i];
            }
        }
        System.out.println("The shortest number " + shortestNumber +" has minimum length "+ minLength + " chars");
    }

    private static void sortNumbersMinToMaxLength() {
        Arrays.sort(arrayOfNumbers);
        printNumbers();
    }

    private static void sortNumbersMaxToMinLength() {
        Integer  temp;
        for(int j=0; j<arrayOfNumbers.length-1;j++) {
            for (int i = j + 1; i < arrayOfNumbers.length; i++) {
                if (arrayOfNumbers[i].compareTo(arrayOfNumbers[j]) > 0) {
                    temp = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[i];
                    arrayOfNumbers[i] = temp;
                }
            }
        }
        printNumbers();
    }

    public static void entryPoint(){
        getNumbersFromConsole();
        System.out.println("The initial array:");
        printNumbers();
        findLongestNumber();
        findShortestNumber();
        System.out.println("The array sorted from min to max length:");
        sortNumbersMinToMaxLength();
        System.out.println("The array sorted from max to min length:");
        sortNumbersMaxToMinLength();
    }
}
