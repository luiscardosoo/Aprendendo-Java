import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao;
        int contador = 0;
        Navio navio = new Navio();
        int[] naviovetor;

        naviovetor = navio.criarNavio();

        Chute chute = new Chute(naviovetor);

        System.out.println("Faça um chute de 0 a 6");
        int chu = scanner.nextInt();
        contador++;
        pontuacao = chute.guess(chu);
        if (pontuacao == 1) {
            System.out.println("Você acertou");
        }
        if (pontuacao == 0) {
            System.out.println("Você errou");
        }
        while (pontuacao < 3) {
            System.out.println("O navio ainda está de pé, tente mais uma vez");
            chu = scanner.nextInt();
            contador++;
            pontuacao = chute.guess(chu) + pontuacao;
            if (pontuacao == 1) {
                System.out.println("Você acertou");
            }
            if (pontuacao == 0) {
                System.out.println("Você errou");
            }
        }
        System.out.println("Parabens você afundou o navio com " + contador + " tentativas");

    }
}