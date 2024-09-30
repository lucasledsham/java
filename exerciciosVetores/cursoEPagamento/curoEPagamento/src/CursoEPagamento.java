import java.util.Scanner;

public class CursoEPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------");

        String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avancado"};

        System.out.println("Escolha dentre os cursos abaixo: ");

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + (i + 1) + "]" + cursos[i]);
        }

        System.out.print("O curso que voce deseja e o: ");
        int cursoEscolhidoPosicao = sc.nextInt();

        boolean numeroValido = cursoEscolhidoPosicao > 0 && cursoEscolhidoPosicao <= cursos.length;

        if (!numeroValido) {
            System.err.println("O numero escolhido nao e uma opcao valida!");
            System.exit(1);
        }

        System.out.println("----------------------------------");

        String[] formasPagamento = new String[] {"Cartao", "Boleto"};

        System.out.println("As opcoes de pagamento sao: ");
        for (int i = 0; i < formasPagamento.length; i++) {
            System.out.println("[" + (i + 1) + "]" + formasPagamento[i]);
        }

        System.out.print("A forma de pagamento escolhida e: ");
        int pagamentoEscolhidoPosicao = sc.nextInt();

        boolean pagamentoValido = pagamentoEscolhidoPosicao > 0 && pagamentoEscolhidoPosicao <= formasPagamento.length;

        if (!pagamentoValido) {
            System.err.println("Numero Invalido");
            System.exit(1);
        }

        String cursoEscolhido = cursos[cursoEscolhidoPosicao - 1];
        String pagamentoEscolhido = formasPagamento[pagamentoEscolhidoPosicao - 1];

        System.out.println("----------------------------------");

        System.out.println("O curso escolhido foi: " + cursoEscolhido + "\nPagamento por: " + pagamentoEscolhido);

        sc.close();
    }
}