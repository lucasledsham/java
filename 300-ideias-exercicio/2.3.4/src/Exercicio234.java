//2.3.4 Iniciais - Escreva um programa que lê nome e sobrenome, e mostra na tela as iniciais.
//2.3.5 Finais - Reescreva o programa anterior para mostrar na tela as letras finais do nome e sobrenome.

import java.util.Scanner;

public class Exercicio234 {
    static Scanner sc = new Scanner(System.in);
    static String nome;
    static String sobrenome;

    public static void main(String[] args) {
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.printf("Iniciais: %c %c", nome.charAt(0), sobrenome.charAt(0));
        System.out.printf("\nLetras Finais: %c %c", nome.charAt(nome.length() - 1), sobrenome.charAt(sobrenome.length() - 1));

    }
}