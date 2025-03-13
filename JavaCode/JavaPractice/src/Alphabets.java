public class Alphabets {

    public static void main(String[] args) {
        String a = "ZY"; // Input column name

        int len = a.length();
        int result = 0;

        // Iterate over each character from left to right
        for (int i = 0; i < len; i++) {
            char x = a.charAt(i);
            int value = x - 'A' + 1; // Map 'A' to 1, 'B' to 2, etc.
            System.out.println("value " + value);
            result = result * 26 + value; // Shift left and add value
            System.out.println("result " + result);
        }

        // Output the result
        System.out.println("Column Number: " + result);
    }
}
