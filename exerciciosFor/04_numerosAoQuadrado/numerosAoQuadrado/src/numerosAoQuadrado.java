// Itere por essa lista e imprima o quadrado de cada número.

public class numerosAoQuadrado {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for(int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int quadrado = numero * numero;

            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        }
    }
}
