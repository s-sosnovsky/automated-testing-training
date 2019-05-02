package exceptions;
import java.io.FileNotFoundException;

/**
 * Created by Sery on 19.03.2019.
 */
public class FileDoesNotExistInTheProjectDirectory extends FileNotFoundException {
    public FileDoesNotExistInTheProjectDirectory(String errorMessage){
        super("File does not exist in the src folder!\n"+ errorMessage);
    }
    public FileDoesNotExistInTheProjectDirectory(){
        super("File does not exist in the src folder!\n");
    }
}
