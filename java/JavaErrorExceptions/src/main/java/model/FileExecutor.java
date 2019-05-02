package model;

import exceptions.FileDoesNotExistInTheProjectDirectory;
import exceptions.FileLineIsEmptyException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.*;

/**
 * Created by Sery on 14.03.2019.
 */
public class FileExecutor {
    private Integer sumOfIntegerElements;
    private PrintWriter outStream;
    private List<String> listOfLinesFromFile;
    private String absolutePathIn;
    private String absolutePathOut;
    {
        sumOfIntegerElements = 0;
        absolutePathIn = System.getProperty("user.dir") + "/input.txt";
        absolutePathOut = System.getProperty("user.dir") + "/output.txt";
    }

    public boolean pathChecker() throws FileDoesNotExistInTheProjectDirectory {
        if(!(Files.exists(Paths.get(absolutePathIn), LinkOption.NOFOLLOW_LINKS))&&
                (Files.exists(Paths.get(absolutePathOut), LinkOption.NOFOLLOW_LINKS))){
            throw new FileDoesNotExistInTheProjectDirectory("Files output.txt/input.txt are " +
                    " not present in the current directory!");
        }
        return true;
    }


    public void getDataFromFile() throws IOException {
        if(pathChecker()){
            listOfLinesFromFile = Files.readAllLines(Paths.get(absolutePathIn), Charset.defaultCharset());
        }
    }

    public void readDataFromFile() throws NumberFormatException {
            for (int i = 0; i < listOfLinesFromFile.size(); i++) {
            try {
                if (listOfLinesFromFile.get(i).equals("")) {
                   throw new FileLineIsEmptyException();
                }
                sumOfIntegerElements += Integer.parseInt(listOfLinesFromFile.get(i));
            }
            catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeDataToFile() {
            try {
                outStream = new PrintWriter("output.txt");
                outStream.write(sumOfIntegerElements.toString());
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("The sum of integers in the file = " + sumOfIntegerElements);
                if(outStream != null) {
                    outStream.close();
                }
            }
    }
}
