import java.util.Random;
import java.util.Scanner;

public class jogoAcerteONumeroWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numeroAleatorio = new Random();
        int numero = numeroAleatorio.nextInt(100) + 1; //Número Aleatório entre 1 e 100

        System.out.println("=".repeat(100));
        System.out.println("JOGO ACERTE O NÚMERO - Tente descobrir o número misterioso");
        while (true) {
            System.out.print("\nDigite um número inteiro: ");
            int numeroDigitado = sc.nextInt();
            if (numeroDigitado < 1 || numeroDigitado > 100) {
                System.err.println("Número fora do alcance!");
            } else if (numeroDigitado == numero) {
                System.out.println("Parabéns você acertou o número!");
                System.out.println("=".repeat(100));
                break;
            } else if (numeroDigitado < numero) {
                System.out.println("Chute baixo!");
            } else {
                System.out.println("Chute alto");
            }
        }

    }
}