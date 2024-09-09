import java.util.Scanner;

public class descontoProduto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite o valor do produto desejado: ");
    double valorProduto = scanner.nextDouble();

    System.out.println("Digite a quantidade do produto desejado: ");
    int quantidadeProduto = scanner.nextInt();

    double subTotal = valorProduto * quantidadeProduto;

    double desconto = 0.0;

    if (quantidadeProduto > 10) {
      desconto = 10.0;
    }

    double valorDesconto = subTotal * desconto / 100;
    double valorFinal = subTotal - valorDesconto;

    if (valorDesconto > 0) {
      System.out.println("\nParabéns você recebeu 10% de desconto!");
      System.out.printf("\nO seu desconto é de R$ %.2f. O total da sua compra é de R$ %.2f.", valorDesconto, valorFinal);


    } else {
      System.out.println("Atenção: Na compra de  10 unidades você receberá 10% de desconto!");
      System.out.printf("Quantidade comprada " + quantidadeProduto + ". O total da sua compra é de R$ %.2f.", subTotal);
    }

    scanner.close();
  }
}