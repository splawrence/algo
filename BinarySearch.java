import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 5, 7, 9, 11 };
        System.out.println(binarySearch(numbers, 9));
        // System.out.println(Arrays.binarySearch(numbers, 9));
    }

    private static int binarySearch(int[] numbers, int number) {
        // setup corner cases with two pointers
        int low = 0;
        int high = numbers.length - 1;

        // until corners cross
        while (low <= high) {
            // find the middle
            int middlePosition = (low + high) / 2;

            // pointer for the number at the middle
            int middleNumber = numbers[middlePosition];

            // found it!
            if (number == middleNumber) {
                return middlePosition;
            }

            // these are not the droids you are looking for
            if (number < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }

        return -1;
    }
}