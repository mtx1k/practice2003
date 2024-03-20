import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 4, 7, 7, 7};
        int[] numbersWithoutDuplicates = noDuplicates(numbers);
        System.out.println(Arrays.toString(numbers) + " -> " + Arrays.toString(numbersWithoutDuplicates));
    }

    private static int[] noDuplicates(int[] numbers) {
        int counter = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                counter++;
            }
        }
        int[] noDuplicates = new int[numbers.length - counter];
        noDuplicates[0] = numbers[0];
        for (int i = 1, j = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                continue;
            }
            noDuplicates[j++] = numbers[i];
        }
        return noDuplicates;
    }
}
