package classes_and_objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String userInput = scanner.nextLine();

        System.out.println("Reversed: " + StringManipulator.reverseString(userInput));

    }
}