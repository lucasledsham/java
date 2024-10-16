import java.util.Scanner;

public class CalculadoraComModulos2 {
    static Scanner sc = new Scanner(System.in);
    static double numeroUm;
    static double numeroDois;
    static String[] operacoesDisponiveis = new String[] {"Adicao (+)", "Subtracao (-)", "Multiplicacao (*)", "Divisao (/)"};
    static int operacaoDesejada;
    static double resultado;

    public static void main(String[] args) {
        linha();
        System.out.println("CALCULADORA");
        numeroUm = numeroDigitado("Digite o primeiro numero: ");
        numeroDois = numeroDigitado("Digite o segundo numero: ");
        iteracaoOperacoesDisponiveis();
        operacaoDesejada = operacaoDesejadaEscolha();
        switchCaseResultado();
        System.out.printf("\nResultado: %.2f", resultado);

    }

    static void linha() {
        System.out.println("=".repeat(100));
    }

    static double numeroDigitado(String texto) {
        System.out.print(texto);
        return sc.nextDouble();
    }

    static void iteracaoOperacoesDisponiveis() {
        System.out.println("\nAs operacoes disponiveis sao: ");
        for (int i = 0; i < operacoesDisponiveis.length; i++) {
            System.out.println("[" + (i + 1)  + "] " + operacoesDisponiveis[i]);
        }
    }

    static int operacaoDesejadaEscolha() {
        System.out.print("Escolha o numero da operacao desejada: ");
        return sc.nextInt();
    }

    static double metodoAdicao() {
        return numeroUm + numeroDois;
    }

    static double metodoSubtracao() {
        return numeroUm - numeroDois;
    }

    static double metodoMultiplicacao() {
        return numeroUm * numeroDois;
    }

    static double metodoDivisao() {
        return numeroUm / numeroDois;
    }

    static void switchCaseResultado() {
        switch (operacaoDesejada) {
            case 1:
                resultado = metodoAdicao();
                break;
            case 2:
                resultado = metodoSubtracao();
                break;
            case 3:
                resultado = metodoMultiplicacao();
                break;
            case 4:
                resultado = metodoDivisao();
                break;
        }
    }
}