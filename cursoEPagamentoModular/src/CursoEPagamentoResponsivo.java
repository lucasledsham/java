import java.util.Scanner;

public class CursoEPagamentoResponsivo {

    final private static String[] cursos = new String[]{"Java SE", "Spring", "Java OO Avançado"};
    final private static String[] pagamentos = new String[]{"Cartão", "Boleto"};
    private static int cursoEscolhido;
    private static int pagamentoEscolhido;

    public static void main(String[] args) {

        linhasDuplas();

        metodoCursos();

        linhasDuplas();

        metodoPagamentos();

        linhasDuplas();

        System.out.println("Curso: " + cursos[cursoEscolhido - 1] + "\nForma de pagamento: " + pagamentos[pagamentoEscolhido - 1]);

    }

    public static void linhasDuplas() {
        System.out.println("=".repeat(70));
    }

    public static void metodoCursos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Os cursos disponíveis são: ");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + (i + 1) + "] " + cursos[i]);
        }

        System.out.print("Digite o número do curso desejado: ");
        cursoEscolhido = sc.nextInt();

        boolean cursoEscolhidoVerificacao = cursoEscolhido > 0 && cursoEscolhido <= cursos.length;
        if (!cursoEscolhidoVerificacao) {
            System.err.println("Número Inválido");
            System.exit(0);
        }
    }


    public static void metodoPagamentos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Confira as formas de pagamento: ");

        for (int i = 0; i < pagamentos.length; i++) {
            System.out.println("[" + (i + 1) + "] " + pagamentos[i]);
        }

        System.out.print("Digite o número da forma de pagamento desejada: ");
        pagamentoEscolhido = sc.nextInt();

        boolean pagamentoEscolhidoVerificacao = pagamentoEscolhido > 0 && pagamentoEscolhido <= pagamentos.length;
        if (!pagamentoEscolhidoVerificacao) {
            System.err.println("Número Inválido");
            System.exit(0);
        }
    }
}