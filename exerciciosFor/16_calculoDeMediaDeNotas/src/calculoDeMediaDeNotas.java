// Programa em Java que:
//Solicite ao usuário o número de notas que ele deseja inserir.
//Use um loop for para permitir que o usuário insira essas notas.
//Calcule a média das notas inseridas.
//Exiba a média ao final.

import java.util.Scanner;

public class calculoDeMediaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas inseridas: ");
        int numeroNotas = sc.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= numeroNotas; i++) {
            System.out.print("Digite o valor da nota " + i + " : ");
            double valorNotal = sc.nextDouble();

            somaNotas += valorNotal;
        }

        double mediaNotas = somaNotas / numeroNotas;

        System.out.printf("\nA media das notas inseridas e de: %.2f", mediaNotas);

    }
}