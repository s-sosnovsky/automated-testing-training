package model;

import exceptions.InputZeroLengthException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

/**
 * Created by Sery on 19.03.2019.
 */
public class ConsoleExecutor {

    public String getInputFromConsole() throws InputZeroLengthException, NumberFormatException {
        String inputLine = null;
        System.out.println("Input a number and press Enter:");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                throw new InputZeroLengthException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!isNumber(inputLine)) {
            throw new NumberFormatException("Your input is not a number!");
        }
        return inputLine;
    }
}
