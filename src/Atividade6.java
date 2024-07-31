import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Atividade6 {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();


        for (int i = 0; i < 1000; i++) {
            fila.add(random.nextInt(1000) + 1);
            fila.add(-(random.nextInt(1000) + 1));


            while (!fila.isEmpty()) {
                int numero = fila.poll();

                if (numero > 0) {
                    pilha.push(numero);
                } else {
                    if (!pilha.isEmpty()) {
                        int topo = pilha.pop();
                        System.out.println("Número no topo da pilha: " + topo);
                    } else {
                        System.out.println("A pilha está vazia, não há nada para desempilhar.");
                    }
                }
            }
        }
    }
}
