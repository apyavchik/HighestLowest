import java.util.Arrays;

public class HighestLowest {
    public static String highAndLow(String numbers) {
        String [] arrayStringNumbers = numbers.split(" ");
        int [] arrayIntNumbers = new int[arrayStringNumbers.length];

        for (int i = 0; i < arrayIntNumbers.length; i++) {
            arrayIntNumbers[i] = Integer.parseInt(arrayStringNumbers[i]);
        }

        Arrays.sort(arrayIntNumbers);

        String max = String.valueOf(arrayIntNumbers[arrayIntNumbers.length-1]);
        String min = String.valueOf(arrayIntNumbers[0]);

        return max + " " + min;
    }
}
