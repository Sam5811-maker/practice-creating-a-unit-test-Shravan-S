package classes_and_objects;

public class StringManipulator {
    // Method to reverse a string
    public static String reverseString(String input) {
        if(input ==null) {
           return null;
        }
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}