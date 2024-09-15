// Itere por essa lista e imprima todos os números ímpares.

public class numerosImpares {
    public static void main(String[] args) {
        int[] listaDeNumeros = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println("Os números ímpares da lista são: ");

        for (int i = 0; i < listaDeNumeros.length; i++) {
            int numero = listaDeNumeros[i];
            int modulo = numero % 2;
            if (modulo == 1) {
                System.out.println(numero);
            }
        }
    }
}
