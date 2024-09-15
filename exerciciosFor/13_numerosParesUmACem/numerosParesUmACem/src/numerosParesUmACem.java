// Escreva um programa que imprima apenas os números pares de 1 a 100.

public class numerosParesUmACem {
    public static void main(String[] args) {

        System.out.println("Os numeros pares de 1 a 100 sao: ");
        for (int i = 1; i <= 100; i++) {
            int modulo = i % 2;

            if (modulo == 0) {
                System.out.println(i);
            }
        }
    }
}
