// Itere por essa lista e calcule o produto de todos os números, imprimindo o resultado no final.

public class produtoDosNumeros {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};

        System.out.println("O produto de todos os números é: ");

        Integer produto = 1;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            produto *= numero;        
        }
        System.out.println(produto);
    }
}
