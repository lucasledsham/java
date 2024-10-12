//2.3.9 Componentes de data - Escrever um programa que lê uma data no formato ‘dd/mm/aa’ e mostra dia, mês e ano separados.

import java.util.Scanner;

public class Exercicio239 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite uma data (formato: dd/MM/yyyy): ");
        String data = sc.nextLine();

        System.out.printf("Data: %c%c\nMês: %c%c\nAno: %c%c", data.charAt(0), data.charAt(1), data.charAt(3), data.charAt(4), data.charAt(6), data.charAt(7));
    }
}