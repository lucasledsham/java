//VERIFICAR QUAIS NUMEROS DENTRO DA LISTA SAO DIVISIVEIS POR TRES

public class divisivelPorTres {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; // Lista de numeros para checar

        for (int i = 0; i < numeros.length; i++) {

            int numero = numeros [i]; // Armazenar o numero
            int divisiveis = numero % 3;

            if (divisiveis == 0) {
                System.out.println(numero + " e divisivel por tres");
            }

        }
    }
}