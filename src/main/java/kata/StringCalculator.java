package kata;

import kata.exception.NegativeNumberException;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        // Handle an empty string
        if ("".equals(numbers.trim())) {
            return sum;
        }
        // Default delimiter
        String delimiter = "[,|\n]";
        //Changing to custom delimiter if there is "//" at the beginning of the string.
        if (numbers.startsWith("//")) {
            //Custom delimiter
            delimiter = "[" + numbers.charAt(2) + "]";
            //Taking only numbers
            numbers = numbers.substring(3);
        }
        List<String> negativeNumbers = new ArrayList<>();
        String[] numArray = numbers.trim().split(delimiter);
        for (String number : numArray) {
            if (Integer.parseInt(number) > 0) {
                sum += Integer.parseInt(number);
            } else {
                negativeNumbers.add(number);
            }
        }
        //Will throw an exception if there were negative numbers
        if (!negativeNumbers.isEmpty()) {
            NegativeNumberException.throwNegativeNumberException(String.join(",", negativeNumbers));
        }
        return sum;
    }
}
