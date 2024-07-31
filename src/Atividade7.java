import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Atividade7 {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Random random = new Random();


        for (int i = 0; i < 20; i++) {
            fila.add(random.nextInt(100));
        }

        System.out.println("Fila original: " + fila);

        inverterFila(fila);

        System.out.println("Fila invertida: " + fila);
    }

    public static void inverterFila(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();


        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }


        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }
}
