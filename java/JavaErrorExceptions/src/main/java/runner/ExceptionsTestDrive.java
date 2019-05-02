package runner;

import model.ConsoleExecutor;
import model.FileExecutor;

import java.io.IOException;

/**
 * Created by Sery on 14.03.2019.
 */

public class ExceptionsTestDrive {
    public static void main(String[] args) {

        try {
            FileExecutor fileExecutor = new FileExecutor();
            ConsoleExecutor consoleExecutor = new ConsoleExecutor();
            fileExecutor.pathChecker();
            fileExecutor.getDataFromFile();
            fileExecutor.readDataFromFile();
            fileExecutor.writeDataToFile();
            System.out.println("Number from console: " + consoleExecutor.getInputFromConsole());

        }
        catch (IOException e){
            e.getMessage();
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}
