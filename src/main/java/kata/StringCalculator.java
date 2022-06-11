package kata;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        // Handle an empty string
        if ("".equals(numbers.trim())) {
            return sum;
        }
        // Splitting by "," OR "\n"
        String[] numArray = numbers.split("[,|\n]");
        for (String number : numArray) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
