//2.3.10 Sorteio da LBV - A LBV fez um sorteio cujos bilhetes continham números de 6 dígitos. O
//sorteio foi baseado nos dois primeiros prêmios da loteria federal, sendo o número sorteado formado
//pelos três últimos dígitos do primeiro e do segundo prêmio. Por exemplo, se o primeiro prêmio
//fosse 34.582 e o segundo 54.098, o número da LBV seria 582.098. Escreva um programa que lê os
//dois prêmios e retorna o número sorteado.

import java.util.Scanner;

public class Exercicio2310 {
    static Scanner sc = new Scanner(System.in);
    static String premioUm;
    static String premioDois;

    public static void main(String[] args) {
        System.out.print("Digite o primeiro prêmio: ");
        premioUm = sc.nextLine();
        System.out.print("Digite o segundo prêmio: ");
        premioDois = sc.nextLine();

        if (premioUm.length() != 6 || premioDois.length() != 6) {
            System.err.println("Os números precisam ter exatamente 6 números!");
            System.exit(0);
        }

        System.out.printf("Número sorteado: %c%c%c%c%c%c", premioUm.charAt(3), premioUm.charAt(4), premioUm.charAt(5),  premioDois.charAt(3),  premioDois.charAt(4),  premioDois.charAt(5));
    }
}