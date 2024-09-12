import java.util.Scanner;;

public class contaFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da conta de luz: ");
        double gastoFamilia = scanner.nextDouble();

        System.out.print("Digite o valor da conta de água: ");
        gastoFamilia += scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: ");
        gastoFamilia += scanner.nextDouble();

        System.out.print("Digite o valor da escola do filho: ");
        gastoFamilia += scanner.nextDouble();

        System.out.print("Digite o valor da fatura do cartão: ");
        gastoFamilia += scanner.nextDouble();

        System.out.print("Digite o valor dos gastos com supermercado: ");
        gastoFamilia += scanner.nextDouble();

        System.out.printf("Gasto total mensal: R$%.2f", gastoFamilia);

        scanner.close();
    }
}
