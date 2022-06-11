package kata.exception;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String exc) {
        super(exc);
    }

    public static void throwNegativeNumberException(String negativeNumbers) {
            throw new NegativeNumberException("negatives not allowed, numbers: " + negativeNumbers);
    }
}
