public class Main {
    public static void main(String[] args) {
//            NINJA 1
        String nomeNinjaUm = "Lauro";
        int idadeNinjaUm = 14;
//        MISSAO NINJA 1
        String nomeMissaoNinjaUm = "Tsunami";
        char nivelMissaoNinjaUm = 'D';
        String statusMissaoNinjaUm = regraStatusMissao(idadeNinjaUm, nivelMissaoNinjaUm);

//            NINJA 2
        String nomeNinjaDois = "Marcos";
        int idadeNinjaDois = 18;
//        MISSAO NINJA 2
        String nomeMissaoNinjaDois = "Terremoto";
        char nivelMissaoNinjaDois = 'S';
        String statusMissaoNinjaDois = regraStatusMissao(idadeNinjaDois, nivelMissaoNinjaDois);

//            NINJA 3
        String nomeNinjaTres = "Igor";
        int idadeNinjaTres = 13;
//        MISSAO NINJA 3
        String nomeMissaoNinjaTres = "Furacao";
        char nivelMissaoNinjaTres = 'B';
        String statusMissaoNinjaTres = regraStatusMissao(idadeNinjaTres, nivelMissaoNinjaTres);

        imprimirInformacoesNinjas("Ninja 1", nomeNinjaUm, idadeNinjaUm, nomeMissaoNinjaUm, nivelMissaoNinjaUm, statusMissaoNinjaUm);
        imprimirInformacoesNinjas("\nNinja 2", nomeNinjaDois, idadeNinjaDois, nomeMissaoNinjaDois, nivelMissaoNinjaDois, statusMissaoNinjaDois);
        imprimirInformacoesNinjas("\nNinja 3", nomeNinjaTres, idadeNinjaTres, nomeMissaoNinjaTres, nivelMissaoNinjaTres, statusMissaoNinjaTres);


    }
    static void imprimirInformacoesNinjas(String ninja, String nome, int idade, String nomeMissao, char nivel, String status) {
        System.out.println(ninja.toUpperCase());
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nNome da Missao: " + nomeMissao + "\nNivel da Missao: " + nivel + "\nStatus da Missao: " + status);
    }
    static String regraStatusMissao(int idade, char nivel) {
        String status;
        if (idade < 15) {
            if (nivel == 'C' || nivel == 'D')
            {
                status = "Concluido";
            } else {
                status = "Nao Concluido";
            }
        } else {
            status = "Concluido";
        }
        return status;
    }
}