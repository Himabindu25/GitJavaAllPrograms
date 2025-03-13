public class Practice {
    public static void main(String[] args) {
        Solution sc = new Solution();

        int[] a = new int[]{4, 3,2,9};
        int[] result = sc.plusOne(a);

        // Print the resulting array
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int a = digits.length - 1; // Index of the last digit
        System.out.println("Last index: " + a);

        // Case 1: If the last digit is less than 9, just increment it
        if (digits[a] < 9) {
            digits[a] += 1; // Increment the last digit
            return digits; // Return the modified array
        } else {
            // Case 2: Handle the carry propagation

            // Check if all digits are 9
            boolean allNine = true;
            for (int digit : digits) {
                if (digit != 9) {
                    allNine = false;
                    break;
                }
            }

            if (allNine) {
                // Create a new array with an extra space for carry
                int[] b = new int[digits.length + 1];
                b[0] = 1; // First digit is 1
                // Remaining digits are 0 by default
                return b;
            } else {
                // Propagate the carry within the same array
                for (int i = a; i >= 0; i--) {
                    if (digits[i] == 9) {
                        digits[i] = 0; // Set current digit to 0
                    } else {
                        digits[i] += 1; // Increment the first non-9 digit
                        break; // Stop propagation
                    }
                }
                return digits;
            }
        }
    }
}
