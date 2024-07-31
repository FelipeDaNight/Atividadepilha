import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class Atividade5 {

    public static void main(String[] args) {
        Queue<Integer> F = new LinkedList<>();
        Stack<Integer> P = new Stack<>();
        Set<Integer> numerosPresentes = new HashSet<>();
        Random random = new Random();


        for (int i = 0; i < 1000; i++) {
            int numeroAleatorio = random.nextInt(10000);
            if (numerosPresentes.contains(numeroAleatorio)) {
                P.push(numeroAleatorio);
            } else {
                F.add(numeroAleatorio);
                numerosPresentes.add(numeroAleatorio);
            }
        }

        System.out.println("Fila F: " + F);

        System.out.println("Pilha P: " + P);
    }
}
