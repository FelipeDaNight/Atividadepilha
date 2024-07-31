import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Atividade4 {

    public static void main(String[] args) {
        Queue<Integer> F1 = new LinkedList<>();
        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            F1.add(random.nextInt(1000));
        }

        System.out.println("Fila F1 original: " + F1);

        Queue<Integer> F2 = inverterFila(F1);

        System.out.println("Fila F2 invertida: " + F2);
    }

    public static Queue<Integer> inverterFila(Queue<Integer> F1) {
        Stack<Integer> pilha = new Stack<>();


        while (!F1.isEmpty()) {
            pilha.push(F1.poll());
        }

        Queue<Integer> F2 = new LinkedList<>();


        while (!pilha.isEmpty()) {
            F2.add(pilha.pop());
        }

        return F2;
    }
}

