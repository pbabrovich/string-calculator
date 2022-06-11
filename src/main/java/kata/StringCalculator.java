package kata;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        // Handle an empty string
        if ("".equals(numbers.trim())) {
            return sum;
        }
        String[] numArray = numbers.trim().split(",");
        for (int i = 0; i < numArray.length; i++) {
            //Up to two numbers
            if (i == 2) {
                break;
            }
            sum += Integer.parseInt(numArray[i]);
        }
        return sum;
    }
}
