package kata;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        // Handle an empty string
        if ("".equals(numbers.trim())) {
            return sum;
        }
        String[] numArray = numbers.trim().split(",");
        for (String numberString : numArray) {
            sum += Integer.parseInt(numberString);
        }
        return sum;
    }
}
