// Escreva um programa que peça um número ao usuário e imprima a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class tabuadaDeUmNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numeroDigitado = scanner.nextInt();

        System.out.println("A tabuada do numero digitado e: ");

        for (int i = 1; i <= 10; i++) {
            int tabuada = i * numeroDigitado;

            System.out.println(numeroDigitado + " x " + i + " =  " + tabuada);
        }
        scanner.close();
    }
}
