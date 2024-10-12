//2.2.19 Notas do professor - Um professor avalia seus alunos através dos seguintes critérios:
//a) Duas notas de exercícios de 0 a 10, sem casas decimais, peso 1 e peso 2, respectivamente, com peso de 20% na nota final.
//b) Uma nota de prova de 0 a 10, com uma casa decimal e peso de 80% na nota final.
// Elabore um programa que lê as notas de um aluno, calcula e mostra na tela sua nota final,
//formatada com uma casa decimal e devidamente ponderada pelos pesos (uma média ponderada é
//calculada somando-se os produtos de cada valor pelo seu peso e dividindo-se a soma resultante pela
//soma dos pesos). Exemplo: Um aluno tirou 5 e 6 de exercícios e 8,5 na prova. Sua nota de
//exercícios é (5*1 + 6*2)/3 = 5,667. Sua nota final é (5,667*2 + 8,5*8)/10 = 7,9.

import java.util.Scanner;

public class Exercicio2219 {
    static Scanner sc = new Scanner(System.in);
    static int[] notasExerciciosIndividuais = new int[2];
    static double notaProva;
    static double notaExercicio;
    static double notaFinal;


    public static void main(String[] args) {
        System.out.print("Digite a nota do exercício 1: ");
        guardarNota(0);
        System.out.print("Digite a nota do exercicio 2: ");
        guardarNota(1);

        notaExercicio = (notasExerciciosIndividuais[0] + notasExerciciosIndividuais[1] * 2) / 3.0;

        System.out.println("Digite a nota da prova: ");
        notaProva = sc.nextDouble();

        notaFinal = (notaExercicio * 2 + notaProva * 8) / 10;
        System.out.printf("Nota Final: %.1f", notaFinal);
    }

    static int guardarNota(int numeroVetor) {
        return notasExerciciosIndividuais[numeroVetor] = sc.nextInt();
    }

}