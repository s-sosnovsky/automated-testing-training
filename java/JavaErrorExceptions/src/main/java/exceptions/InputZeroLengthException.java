package exceptions;

/**
 * Created by Sery on 19.03.2019.
 */
public class InputZeroLengthException extends IllegalArgumentException{
    public InputZeroLengthException(){
        super("Empty input");
    }
    public InputZeroLengthException(String errorMessage){
        super("Empty input" + errorMessage);
    }
}
