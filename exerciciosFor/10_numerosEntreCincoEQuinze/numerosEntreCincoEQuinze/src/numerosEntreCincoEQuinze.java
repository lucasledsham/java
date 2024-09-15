// Itere por essa lista e imprima todos os números que estão entre 5 e 15 (inclusive).

public class numerosEntreCincoEQuinze {
    public static void main(String[] args) {
        int[] numeros = {1, 5, 8, 10, 15, 18, 20};

        System.out.println("Os números que estão entre 5 e 15 são: ");

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            boolean condicao = numero >= 5 && numero <= 15;

            if (condicao) {
                System.out.println(numero);
            }
        }
    }
}
