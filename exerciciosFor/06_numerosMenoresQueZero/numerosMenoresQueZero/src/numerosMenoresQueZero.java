// Itere por essa lista e imprima todos os números que são menores que 0.

public class numerosMenoresQueZero {
    public static void main(String[] args) {
        int[] numeros = {10, -5, 7, -2, 15, -8, 20, -3};

        System.out.println("Os números menores que 0 são: ");

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];

            if (numero < 0) {
                System.out.println(numero);
            }
        }
    }
}