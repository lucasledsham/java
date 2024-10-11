//1.1.15 Menu - Elabore um programa que mostre o seguinte menu na tela:
//
// Cadastro de Clientes
//
// 0 - Fim
// 1 - Inclui
// 2 - Altera
// 3 - Exclui
// 4 - Consulta
//
// Opção: _

public class Exercicio1115 {
    static String[] opcoesMenu = new String[] {"Fim", "Incluir", "Altera", "Exclui", "Consulta"};

    public static void main(String[] args) {
        System.out.println("Cadastro de Clientes\n");
        for (int i = 0; i < opcoesMenu.length; i++) {
            System.out.println(i + " - " + opcoesMenu[i]);
        }
        System.out.println("\nOpcao: ");

    }
}