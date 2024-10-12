// Devagar se vai ao longe - Vou e volto diariamente a pé para o trabalho, que dista
//aproximadamente 800 m de minha casa. Supondo que trabalho 5 dias por semana, 45 semanas por
//ano, "bole" a operação matemática que deve ser efetuada para calcular quantos quilômetros,
//aproximadamente, terei andado ao final de um ano. Elabore um programa que faça as contas e
//mostre o resultado na tela.

public class Exercicio1214 {
    static int distanciaEmMetros = 800;
    static int diasDeTrabalhoPorSemana = 5;
    static int semanasTrabalhadas = 45;
    static int totalDiasTrabalhados;
    static int metrosAndadosDia;
    static int totalMetrosAndadosAno;

    public static void main(String[] args) {
        totalDiasTrabalhados = diasDeTrabalhoPorSemana * semanasTrabalhadas;
        metrosAndadosDia = distanciaEmMetros * 2;
        totalMetrosAndadosAno = totalDiasTrabalhados * metrosAndadosDia;

        double quilometrosAndadosAno = totalMetrosAndadosAno / 1000.0;

        System.out.printf("O total de quilometros andados em um ano e de: %.2f", quilometrosAndadosAno);
    }
}