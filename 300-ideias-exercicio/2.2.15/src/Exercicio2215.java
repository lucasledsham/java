//Adivinha - Escrever um programa que “adivinha” o número pensado por uma pessoa (Pense
//um número (pausa), multiplique por 2 (pausa), some 6 ao resultado (pausa), divida o resultado por
//2, quanto deu? (informe o resultado), você pensou o número tal). [Dica: problemas desse tipo dão
//origem a uma expressão aritmética, e você pode alterar as operações à vontade, desde que a
//expressão resultante admita uma inversa. Normalmente estruturamos o problema de forma que a
//expressão permita uma simplificação que facilite os cálculos. Para a seqüência proposta, a
//expressão é (sendo n o número pensado e R o resultado): (n*2+6)/2 = R, donde n = (R*2-6)/2 = R
//- 3. Ou seja, basta subtrair 3 do resultado fornecido pela pessoa para "adivinhar" o número].

import java.util.Scanner;

public class Exercicio2215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SEJA BEM-VINDO AO ADIVINHADOR DE NÚMERO!");
        System.out.println("Passo 1: Pense em um numero");
        System.out.println("Passo 2: Multiplique por dois");
        System.out.println("Passo 3: Some 6 ao resultado");
        System.out.println("Passo 4: Divida o resultado por dois");
        System.out.print("Passo 5: Escreva o resultado das operacoes: ");
        int numero = sc.nextInt();
        int resultado = numero - 3;
        System.out.println("O numero que voce pensou e: " + resultado);
    }
}