import java.util.Scanner;
import java.util.Stack;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sequência de caracteres: ");
        String input = scanner.nextLine();

        String reversed = reverseText(input);
        System.out.println("Texto na ordem inversa: " + reversed);


        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }
    }

    private static String reverseText(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    private static boolean checkPalindrome(String text) {
        Stack<Character> stack = new Stack<>();
        StringBuilder cleanedText = new StringBuilder();


        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedText.append(Character.toLowerCase(c));
            }
        }

        String cleanedString = cleanedText.toString();

        for (char c : cleanedString.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleanedString.equals(reversed.toString());
    }
}
