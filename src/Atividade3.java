import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
    private String nome;
    private int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Avião [Nome=" + nome + ", Identificador=" + identificador + "]";
    }
}

class ControlePista {
    private Queue<Aviao> filaDecolagem;

    public ControlePista() {
        filaDecolagem = new LinkedList<>();
    }

    public int numeroAvioesAguardando() {
        return filaDecolagem.size();
    }

    public void autorizarDecolagem() {
        if (!filaDecolagem.isEmpty()) {
            Aviao aviao = filaDecolagem.poll();
            System.out.println("Decolagem autorizada para: " + aviao);
        } else {
            System.out.println("Não há aviões na fila de decolagem.");
        }
    }

    public void adicionarAviaoFila(String nome, int identificador) {
        Aviao aviao = new Aviao(nome, identificador);
        filaDecolagem.add(aviao);
        System.out.println("Avião adicionado à fila: " + aviao);
    }

    public void listarAvioesNaFila() {
        if (filaDecolagem.isEmpty()) {
            System.out.println("Não há aviões na fila de decolagem.");
        } else {
            System.out.println("Aviões na fila de decolagem:");
            for (Aviao aviao : filaDecolagem) {
                System.out.println(aviao);
            }
        }
    }

    public void listarPrimeiroAviao() {
        if (!filaDecolagem.isEmpty()) {
            Aviao aviao = filaDecolagem.peek();
            System.out.println("Primeiro avião na fila: " + aviao);
        } else {
            System.out.println("Não há aviões na fila de decolagem.");
        }
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        ControlePista controlePista = new ControlePista();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2. Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3. Adicionar um avião à fila de espera");
            System.out.println("4. Listar todos os aviões na fila de espera");
            System.out.println("5. Listar as características do primeiro avião da fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando: " + controlePista.numeroAvioesAguardando());
                    break;
                case 2:
                    controlePista.autorizarDecolagem();
                    break;
                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o identificador do avião: ");
                    int identificador = scanner.nextInt();
                    controlePista.adicionarAviaoFila(nome, identificador);
                    break;
                case 4:
                    controlePista.listarAvioesNaFila();
                    break;
                case 5:
                    controlePista.listarPrimeiroAviao();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
