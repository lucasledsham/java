import java.util.Scanner;

public class CursoEPagamentoModular {

    public static Scanner sc = new Scanner(System.in);
    public static String[] cursos = new String[] {"Violao", "Guitarra", "Piano", "Canto", "Bateria"};
    public static int cursoEscolhido;
    public static String[] formaDePagamento = new String[] {"Cartao", "Boleto", "Dinheiro", "PIX"};
    public static int pagamentoEscolhido;

    public static void main(String[] args) {
        imprimirLinha();
        cursosOferecidos();
        imprimirLinha();
        pagamentosOferecidos();
        imprimirLinha();
        System.out.println("Curso: " + cursos[cursoEscolhido - 1] + "\nPagamento: " + formaDePagamento[pagamentoEscolhido - 1]);
    }

    public static void imprimirLinha() {
        System.out.println("=".repeat(50));
    }

    public static void cursosOferecidos() {
        System.out.println("Os cursos disponiveis sao: ");
        loopForListas(cursos);
        System.out.print("Digite o numero do curso desejado: ");
        cursoEscolhido = sc.nextInt();
        boolean cursoEscolhidoVerificacao = numeroDigitadoUsuarioVerificacao(cursoEscolhido, cursos);
        if (!cursoEscolhidoVerificacao) {
            mensagemErro();
        }
    }

    public static void pagamentosOferecidos() {
        System.out.println("As formas de pagamento disponiveis sao: ");
        loopForListas(formaDePagamento);
        System.out.print("Digite o numero do pagamento desejado: ");
        pagamentoEscolhido = sc.nextInt();
        boolean pagamentoVerificacao= numeroDigitadoUsuarioVerificacao(pagamentoEscolhido, formaDePagamento);
        if (!pagamentoVerificacao) {
            mensagemErro();
        }
    }


    public static void loopForListas(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + (i + 1) + "] " + vetor[i]);
        }
    }

    public static boolean numeroDigitadoUsuarioVerificacao(int numero, String[] lista) {
        return numero > 0 && numero <= lista.length;
    }

    public static void mensagemErro() {
        System.err.println("Digite um numero valido!");
        System.exit(0);
    }
}