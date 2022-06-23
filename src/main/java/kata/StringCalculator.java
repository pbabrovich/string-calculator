package kata;

import kata.exception.NegativeNumberException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        String[] numArray = numbers.trim().split(delimiter);
        List<String> negativeNumbers = Arrays.stream(numArray)
                .filter(e -> Integer.parseInt(e) < 0).collect(Collectors.toList());
        //Will throw an exception if there were negative numbers
        if (!negativeNumbers.isEmpty()) {
            NegativeNumberException.throwNegativeNumberException(String.join(",", negativeNumbers));
        }
        return Arrays.stream(numArray).filter(e -> Integer.parseInt(e) > 0 && Integer.parseInt(e) < 1000)
                .mapToInt(Integer::parseInt).sum();
    }
}
