// Itere por essa lista e imprima todos os números que terminam em 5.

public class numerosTerminandoEmCinco {
    public static void main(String[] args) {
        int[] lista = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        
        System.out.println("Os números que terminam em 5 são: ");

        for (int i = 0; i < lista.length; i++) {
            int modulo = lista[i] % 10;

            if (modulo == 5) {
                System.out.println(lista[i]);
            }
        }
    }
}
