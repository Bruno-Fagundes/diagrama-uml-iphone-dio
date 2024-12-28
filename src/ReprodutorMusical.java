import java.util.Scanner;

public class ReprodutorMusical {
    String artista;
    String musica;
    boolean estaTocando = false;

    public void tocar() {
        if (!estaTocando) {
            System.out.println("Tocando musica");
            estaTocando = true;
        }
    }

    public void pausar() {
        if (estaTocando) {
            System.out.println("Pausando musica");
        }
    }

    public void selecionarMusica() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Musica: ");
        musica = scanner.nextLine();
        System.out.println("Artista: ");
        artista = scanner.nextLine();

        System.out.println("Musica selecionada: " + artista + " - " + musica);
        tocar();
    }
}
