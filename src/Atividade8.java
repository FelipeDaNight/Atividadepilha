import java.util.Random;
import java.util.Stack;

public class Atividade8 {

    private Stack<Integer> P;
    private Stack<Integer> N;

    public Atividade8() {
        P = new Stack<>();
        N = new Stack<>();
    }

    public void processarNumeros() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100; // Gera números entre -100 e 100

            if (numero > 0) {
                P.push(numero);
            } else if (numero < 0) {
                N.push(numero);
            } else {
                if (!P.isEmpty() && !N.isEmpty()) {
                    int positivo = P.pop();
                    int negativo = N.pop();
                    System.out.println("Retirado da pilha P: " + positivo);
                    System.out.println("Retirado da pilha N: " + negativo);
                } else {
                    System.out.println("Uma das pilhas está vazia, não é possível retirar elementos.");
                }
            }
        }
    }

    public void imprimirPilhas() {
        System.out.println("Pilha P (positivos): " + P);
        System.out.println("Pilha N (negativos): " + N);
    }

    public static void main(String[] args) {
        Atividade8 Atividade8 = new Atividade8();
        Atividade8.processarNumeros();
        Atividade8.imprimirPilhas();
    }
}
