// Escreva um programa que peça um número ao usuário e calcule o fatorial desse número.

import java.util.Scanner;

public class fatorialDeUmNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numeroDigitado = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numeroDigitado; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + numeroDigitado + " e: " + fatorial);

        scanner.close();
    }
}
