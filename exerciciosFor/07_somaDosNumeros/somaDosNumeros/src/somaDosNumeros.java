// Itere por essa lista e calcule a soma de todos os números, imprimindo o resultado no final.

public class somaDosNumeros {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
