// JOGO ACERTE O NUMERO

import java.util.Scanner;

public class AcerteONumero {
    public static int numero = 23;
    public static Scanner sc = new Scanner(System.in);
    public static int numeroEscolhido;
    public static boolean descobriu = false;

    public static void main(String[] args) {
        System.out.println("=".repeat(50));

        for (int i = 0; i < 3; i++) {
            if (!descobriu) {
                condicaoJogo();
            }

        }
        mensagemFinal();
    }

    public static void condicaoJogo() {
        System.out.print("Descubra o numero! Digite um numero inteiro (1 a 30): ");
        numeroEscolhido = sc.nextInt();
        if (numeroEscolhido < numero) {
            System.out.println("Chute baixo, escolha um numero mais alto.");
        } else if (numeroEscolhido > numero) {
            System.out.println("Chute alto, escolha um numero mais baixo.");
        } else {
            System.out.println("Numero correto!");
            descobriu = true;
        }
    }


    public static void mensagemFinal() {
        if (descobriu) {
            System.out.println("Parabens voce venceu o jogo!");
        } else {
            System.out.println("Infelizmente voce nao acertou o numero. O numero correto era: " + numero);
        }
    }

}