// Itere por essa lista e imprima todos os números que são divisíveis por 2.

public class numerosDivisiveisPorDois {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int modulo = numero % 2;
            
            if (modulo == 0) {
                System.err.println(numero + " é divisível por dois.");
            }

        }
    }
}
