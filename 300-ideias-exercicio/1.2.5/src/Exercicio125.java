//Otimização de corte - Um marceneiro, para fazer um trabalho, precisa cortar vários pedaços de
//madeira de 45 cm cada um. Ele pode comprar tábuas de 3, 4 ou 5 metros. Usando os operadores div
//e mod, faça um programa que calcule a quantidade de pedaços e a sobra para cada tipo de tábua,
//permitindo assim uma melhor escolha do marceneiro.

public class Exercicio125 {
    static int pedacosMadeiraCentimetros = 45;
    static int numeroDeTabuas;
    static double sobraMadeira;
    static int metros3 = 3;
    static int metros4 = 4;
    static int metros5 = 5;

    public static void main(String[] args) {

        int metros3EmCentimetros = contaCentimetros(metros3);
        int metros4EmCentimetros = contaCentimetros(metros4);
        int metros5EmCentimetros = contaCentimetros(metros5);

        int[] listaCentimetrosTabuas = new int[] {metros3EmCentimetros, metros4EmCentimetros, metros5EmCentimetros};
        for (int i = 0; i < listaCentimetrosTabuas.length; i++) {
            numeroDeTabuas = listaCentimetrosTabuas[i] / pedacosMadeiraCentimetros;
            System.out.println((i + 3) + " METROS");
            System.out.println("Quantidade de pedaços: " + numeroDeTabuas);
            sobraMadeira = listaCentimetrosTabuas[i] % pedacosMadeiraCentimetros;
            System.out.println("Sobra: " + sobraMadeira + " cm\n");
        }
    }

    static int contaCentimetros(int metro) {
        return metro * 100;
    }
}


