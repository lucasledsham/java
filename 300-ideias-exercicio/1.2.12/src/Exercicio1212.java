// Cálculo de notas - Um professor atribui pesos de 1 a 4 para as notas de quatro avaliações. A
//nota é calculada por meio da média ponderada (N1 + N2*2 + N3*3 + N4*4)/10, onde N1 é a nota
//da primeira avaliação, N2 a da segunda, etc..Um aluno tirou as seguintes notas: 8 - 7,5 - 10 - 9.
//Faça um programa que calcula e mostra as notas e a média deste aluno, sendo a média formatada com 1 casa decimal.

public class Exercicio1212 {
    static double[] notasAlunos = new double[] {8.0, 7.5, 10.0, 9};
    static double mediaAluno;

    public static void main(String[] args) {
        double nota1 = notasAlunos[0];
        double nota2 = notasAlunos[1];
        double nota3 = notasAlunos[2];
        double nota4 = notasAlunos[3];

        for (int i = 0; i < notasAlunos.length; i++) {
            if (i == 1) {
                nota2 = notasAlunos[i] * 2;
            }  else if (i == 2) {
                nota3 = notasAlunos[i] * 3;
            } else if (i == 3) {
                nota4 = notasAlunos[i] * 4;
            } else {
                nota1 = notasAlunos[i] * 1;
            }
            mediaAluno = (nota1 + nota2 + nota3 + nota4) / 10;
        }
        System.out.printf("A media do aluno foi de %.1f", mediaAluno);
    }
}