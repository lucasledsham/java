import java.util.Scanner;

public class formaPagamentoETaxa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.println("Escolha a forma de pagamento: [Digite 1 para pagamento Á Vista / Digite 2 para pagamento À Prazo]");
        int formaPagamento = scanner.nextInt();

        boolean pagamentoAVista = formaPagamento == 1;
        int taxa = 0;

        if (!pagamentoAVista) {
            taxa = 10;
        }

        double valorAcrescimo = valorProduto * taxa / 100;

            if (valorAcrescimo > 0) {
                System.out.printf("\nPara pagamento À Prazo realimos um acréscimo de 10%% no valor total. Dessa forma, seu pagamento irá ter um acréscimo de R$ %.2f", valorAcrescimo);
            }


        double valorFinal = valorProduto + valorAcrescimo;
        System.out.println("\n");
        System.out.println("Produto: " + nomeProduto);
        System.out.printf("O valor total é R$ %.2f.", valorFinal);

        scanner.close();
    }
}