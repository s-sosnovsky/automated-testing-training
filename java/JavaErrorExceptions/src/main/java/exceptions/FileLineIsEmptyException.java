package exceptions;

/**
 * Created by Sery on 19.03.2019.
 */
public class FileLineIsEmptyException extends IllegalArgumentException{
    public FileLineIsEmptyException(String errorMessage){
        super("File contains empty string(s)" + errorMessage);
    }
    public FileLineIsEmptyException(){
        super("File contains empty string(s)");
    }

}
