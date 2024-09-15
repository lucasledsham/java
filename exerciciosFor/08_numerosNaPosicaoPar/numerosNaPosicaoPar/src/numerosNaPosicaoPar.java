//Itere por essa lista e imprima os números que estão em uma posição de índice par (0, 2, 4, ...).

public class numerosNaPosicaoPar {
    public static void main(String[] args) {
    int[] numeros = {4, 7, 9, 12, 15, 18, 21};
    System.out.println("Os números que estão em uma posição de índice par são: ");

    for (int i = 0; i < numeros.length; i++) {
        int numero = numeros[i];
        int modulo = i % 2;

        if (modulo == 0) {
            System.out.println(numero);
        }
    }
  }
}
