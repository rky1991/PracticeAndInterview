package sapient;

import java.util.Arrays;

public class ShiftEvenOdd {
    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        // Shift even numbers left and odd numbers right
        rearrangeArray(array);

        // Output the result
        System.out.println("Rearranged array: " + Arrays.toString(array));
    }

    public static void rearrangeArray(int[] array) {
        int left = 0;                  // Pointer for even numbers
        int right = array.length - 1; // Pointer for odd numbers

        while (left < right) {
            // Move the left pointer until an odd number is found
            while (left < right && array[left] % 2 == 0) {
                left++;
            }

            // Move the right pointer until an even number is found
            while (left < right && array[right] % 2 != 0) {
                right--;
            }

            // Swap the odd number at the left with the even number at the right
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }
}
