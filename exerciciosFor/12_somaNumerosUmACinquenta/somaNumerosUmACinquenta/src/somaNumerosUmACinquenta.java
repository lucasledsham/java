// Escreva um programa que calcule a soma de todos os números de 1 a 50.

public class somaNumerosUmACinquenta {
    public static void main(String[] args){
        int soma = 0;
        for (int i = 1; i <= 50; i++) {
            soma += i;
        }
        System.out.println("A soma de 1 a 50 é: " + soma);
    }
}