package kata;

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
        for (String number : numArray) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
