/**
 * Created by Sery on 13.02.2019.
 */
import java.util.Arrays;
import java.util.Scanner;
public class MatrixMagic {

    public static void main(String[] args) {
        MatrixMagic.entryPoint();
    }

    private static int[][] createMatrix(int sizeOfMatrix) {
        int matrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                int rnd = (int) (Math.random() * (2 * sizeOfMatrix + 1)) - sizeOfMatrix;
                matrix[i][j] = rnd;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrixToPrint) {
        for (int i = 0, n = matrixToPrint.length; i < n; i++) {
            System.out.println(Arrays.toString(matrixToPrint[i]));

        }
    }

    private static int checkCorrectValuesInput(String rawSizeOfMatrix) throws IllegalArgumentException {

        try {
            Integer.parseInt(rawSizeOfMatrix);
        } catch (Exception e) {
            throw new NumberFormatException("The input value is not a number\n");
        }
        if ((Integer.parseInt(rawSizeOfMatrix) < 0)) {
            throw new IllegalArgumentException("Dimension can not be < 0\n");
        }
        return Integer.parseInt(rawSizeOfMatrix);
    }

    private static int columnIndexControl(String rawColumnToSort, String matrixSize) throws IllegalArgumentException {

        try {
            Integer.parseInt(matrixSize);
            Integer.parseInt(rawColumnToSort);

        } catch (Exception e) {
            throw new NumberFormatException("NaN\n");
        }
        if ((Integer.parseInt(rawColumnToSort) >= Integer.parseInt(matrixSize)) || Integer.parseInt(rawColumnToSort)<0) {
            throw new IllegalArgumentException("The colunm's index can not be greater than the matrix's dimension " +
                    "and < 0\n");
        }
        return Integer.parseInt(rawColumnToSort);
    }

    private static int[][] sortMatrixByColumnAscend(int[][] matrixToSort, int columnIndexToSort) {
        int[][] matrixSort = matrixToSort.clone();
        for (int k = 0; k < matrixSort.length; k++) {
            for (int j = 0; j < matrixSort.length - k - 1; j++) {
                if (matrixSort[j][columnIndexToSort] > matrixSort[j + 1][columnIndexToSort]) {
                    swapValues(matrixSort, j);
                }
            }
        }
        return matrixSort;
    }

    private static void swapValues(int[][] matrixSort, int j) {
        int[] tmp = matrixSort[j];
        matrixSort[j] = matrixSort[j + 1];
        matrixSort[j + 1] = tmp;
    }

    private static int[][] shiftMatrixCyclicallyToRight(int[][] initialMatrix, int shiftValue) {

        int[][] shiftedMatrix = new int[initialMatrix.length][initialMatrix.length];
        for (int i = 0; i < initialMatrix.length; i++) {
            for (int j = 0; j < initialMatrix.length; j++) {
                shiftedMatrix[i][(shiftValue + j) % initialMatrix.length] = initialMatrix[i][j];
            }
        }
        return shiftedMatrix;
    }

    public static void entryPoint() {

        System.out.println("Please enter the size of the matrix: ");
        Scanner scanMatrixSize = new Scanner(System.in);
        String rawSizeOfMatrix = scanMatrixSize.next();
        System.out.println("Please enter an index of colunm to sort ascend: ");
        Scanner scanRawColumnToSort = new Scanner(System.in);
        String rawColumnToSort = scanRawColumnToSort.next();
        System.out.println("Please enter a value for shifting to the right: ");
        Scanner scanShiftValue = new Scanner(System.in);
        String rawShiftValue = scanShiftValue.next();

        try {
            int sizeOfMatrix = checkCorrectValuesInput(rawSizeOfMatrix);
            int[][] initialMatrix = createMatrix(sizeOfMatrix);
            System.out.println("The initial matrix" );
            printMatrix(initialMatrix);
            int shiftValue = checkCorrectValuesInput(rawShiftValue);
            int columnIndexToSort = columnIndexControl(rawColumnToSort, rawSizeOfMatrix);
            System.out.println("Sorted by " + (columnIndexToSort+1) + " column ascend: ");
            printMatrix(sortMatrixByColumnAscend(initialMatrix,
                    columnIndexToSort));
            System.out.println("Cyclic shift to the right by " + shiftValue + " column: ");
            printMatrix(shiftMatrixCyclicallyToRight(initialMatrix, shiftValue));
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage()+ "Bad input");
        }

        }

    }

