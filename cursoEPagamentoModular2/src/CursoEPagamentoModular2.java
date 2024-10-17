import java.util.Scanner;

public class CursoEPagamentoModular2 {
    static Scanner sc = new Scanner(System.in);
    static String[] cursos = new String[] {"Violao", "Guitarra", "Bateria", "Canto", "Piano"};
    static int cursoEscolhido;
    static String[] formasDePagamento = new String[] {"Cartao", "Boleto", "Dinheiro", "PIX"};
    static int pagamentoEscolhido;
    static boolean numeroValido;

    public static void main(String[] args) {
        linha();
        System.out.println("APRENDA UM NOVO INSTRUMENTO!");
        mostraOsCursosDisponiveis("\nOs cursos disponiveis sao: ", cursos);
        cursoEscolhido = realizarAEscolhaDasOpcoesDisponiveis("Escolha o numero do curso desejado: ");
        verificacaNumeroDigitadoCurso();
        mensagemErro();

        mostraOsCursosDisponiveis("\nAs formas de pagamento disponiveis sao: ", formasDePagamento);
        pagamentoEscolhido = realizarAEscolhaDasOpcoesDisponiveis("Escolha o numero do pagamento desejado: ");
        verificacaNumeroDigitadoPagamento();
        mensagemErro();

        System.out.println("\nCurso: " + cursos[cursoEscolhido - 1] + "\nPagamento: " + formasDePagamento[pagamentoEscolhido - 1]);
    }

    static void linha() {
        System.out.println("=".repeat(100));
    }

    static void mostraOsCursosDisponiveis(String texto, String[] vetor) {
        System.out.println(texto);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + (i + 1) + "] " + vetor[i]);
        }
    }

    static int realizarAEscolhaDasOpcoesDisponiveis(String texto) {
        System.out.print(texto);
        return sc.nextInt();
    }


    static boolean regraNumeroDigitado(int numeroDigitado, String[] vetor) {
        return numeroDigitado > 0 && numeroDigitado <= vetor.length;
    }

    static void verificacaNumeroDigitadoCurso() {
        numeroValido = regraNumeroDigitado(cursoEscolhido, cursos);
    }

    static void verificacaNumeroDigitadoPagamento() {
        numeroValido = regraNumeroDigitado(pagamentoEscolhido, formasDePagamento);
    }

    static void mensagemErro() {
        if (!numeroValido) {
            System.err.println("Digite um numero valido!");
            System.exit(0);
        }
    }
}