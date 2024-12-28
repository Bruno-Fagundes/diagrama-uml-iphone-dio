import java.util.Random;
import java.util.Scanner;

public class AparelhoTelefonico {
    String numero;

    AparelhoTelefonico (String numero) {
        this.numero = numero;
    }

    public void ligar(String numero) {
        Random random = new Random();
        int tentativas = 0;
        boolean atendeu = false;

        System.out.println("Ligando para " + numero + "...");

        while (tentativas < 3 && !atendeu) {
            tentativas++;

            int numeroAleatorio = random.nextInt(10) + 1;

            if (numeroAleatorio == 1) {
                System.out.print("Chamada atendida");
                atendeu = true;
            }
        }

        if (!atendeu) {
            System.out.print("Ligacao recusada");
        }
    }

    public void atender() {
        System.out.println("\nLigacao atendida");
    }

    public void iniciarCorreioVoz() {
        Scanner scanner = new Scanner(System.in);
        String mensagem;

        System.out.print("Deixe sua mensagem:");
        mensagem = scanner.nextLine();
    }
}
