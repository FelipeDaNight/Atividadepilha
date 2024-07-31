
import java.util.Scanner;
import java.util.Stack;

    public class Atividade2 {

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            Scanner scanner = new Scanner(System.in);

            // Preenchendo a pilha com alguns elementos para teste
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            System.out.println("Pilha original: " + stack);
            System.out.print("Digite a chave a ser removida: ");
            int key = scanner.nextInt();

            removeItem(stack, key);

            System.out.println("Pilha após a remoção do item com chave " + key + ": " + stack);
        }

        public static void removeItem(Stack<Integer> stack, int key) {
            Stack<Integer> tempStack = new Stack<>();


            while (!stack.isEmpty()) {
                int item = stack.pop();
                if (item != key) {
                    tempStack.push(item);
                }
            }

            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }
    }


