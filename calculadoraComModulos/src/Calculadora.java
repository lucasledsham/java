//Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição, subtração, multiplicacao e divisao.
// Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
//  que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração, multiplicacao e divisao.


import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    static String[] operacoes = new String[] {"Adicao", "Subtracao", "Multiplicacao", "Divisao"};
    static double numero1;
    static double numero2;
    static int operacaoDesejada;
    static double resultado;

    public static void main(String[] args) {
        linha();

        System.out.println("CALCULADORA\n");

        System.out.print("Digite o primeiro numero: ");
        numero1 = guardarNumero();
        System.out.print("Digite o segundo numero: ");
        numero2 = guardarNumero();

        metodoLoopOperacoes();

        boolean verificacaoOperadores = verficicacaoNumeroDigitadoUsuario();
        if (!verificacaoOperadores) {
            System.err.println("Digite um numero valido!");
            System.exit(0);
        }

        switchOperacao();
        System.out.println("\n");
        linha();

    }

    static void linha() {
        System.out.println("=". repeat(100));
    }

    static double guardarNumero() {
        return sc.nextDouble();
    }

    static void metodoLoopOperacoes() {
        System.out.println("As operacoes disponiveis sao: ");
        for (int i = 0; i < operacoes.length; i++) {
            System.out.println("[" + (i + 1) + "] " + operacoes[i]);
        }
        System.out.println("Digite o numero da operacao desejada: ");
        operacaoDesejada = sc.nextInt();
    }

    static void switchOperacao() {
        switch (operacaoDesejada) {
            case 1:
                resultado = metodoAdicao();
                imprimirResultado();
                break;
            case 2:
                resultado = metodoSubtracao();
                imprimirResultado();
                break;
            case 3:
                resultado = metodoMultiplicacao();
                imprimirResultado();
                break;
            case 4:
                resultado = metodoDivisao();
                imprimirResultado();
                break;
        }
    }

    static boolean verficicacaoNumeroDigitadoUsuario() {
        return operacaoDesejada > 0 && operacaoDesejada <= 4;
    }

    static double metodoAdicao() {
        return numero1 + numero2;
    }

    static double metodoSubtracao() {
        return numero1 - numero2;
    }

    static double metodoMultiplicacao() {
        return numero1 * numero2;
    }

    static double metodoDivisao() {
        return numero1 / numero2;
    }

    static void imprimirResultado() {
        System.out.printf("Resultado: %.2f", resultado);
    }
}