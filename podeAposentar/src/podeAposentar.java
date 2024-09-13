import java.util.Scanner;

public class podeAposentar {

    private static final int IDADE_MINIMA_PARA_APOSENTAR = 55;
    private static final int CONTRIBUICAO_MINIMA_PREVIDENCIA = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        int idadePessoa = scanner.nextInt();

        System.out.print("Contribuição Previdência (anos): ");
        int contribuicaoPrevidencia = scanner.nextInt();

        boolean podeAposentar = idadePessoa >= IDADE_MINIMA_PARA_APOSENTAR && contribuicaoPrevidencia >= CONTRIBUICAO_MINIMA_PREVIDENCIA;

        if (podeAposentar) {
            System.out.println("Pode aposentar!");
        } else {
            System.out.println("Não pode aposentar.");
        }

        scanner.close();
    }
}
