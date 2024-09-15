// Itere por essa lista e imprima todos os números que são maiores que 10.

public class numerosMaioresQueDez {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 15, 20, 3, 7, 11};

        System.out.println("Os números maiores que dez são: ");
        
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros [i];

            if (numero > 10) {
                System.out.println(numero);
            }
        }
    }
}
