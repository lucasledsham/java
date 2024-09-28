//Desenvolva uma calculadora que solicite ao usuário dois números e uma operação matemática (+, -, *, /).
//Use o switch para realizar a operação e exibir o resultado.

import java.util.Scanner;

public class calculadoraSimplesSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("Digite a operacao matematica: ");
        char operacao = sc.next().charAt(0);

        double resultado;

        while (true) {
            switch (operacao) {
                case '+':
                    resultado = numero1 + numero2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case '/':
                    resultado = numero1 / numero2;
                    System.out.println("Resultado = " + resultado);
                    break;
                default:
                    System.out.println("Digite um valor valido!");
                    continue;
            }
            break;
        }
    }
}