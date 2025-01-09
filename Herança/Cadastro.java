public class Cadastro{
    
    public static void main(String[] args) {

        // Entendendo sobre herança em uma classe.

        Fisica fis = new Fisica();
        fis.nome = "Leandro";
        fis.situacaoPessoa = "Ativa";
        fis.cpf = "45416859634";
        fis.identidade = "596821";
        System.out.println("Dados da pessoa Física: ");
        System.out.println(fis.toString());


        Juridica jur = new Juridica();
        jur.nome = "Lucas";
        jur.situacaoPessoa = "Inativo";
        jur.cnpj = "159357000125";
        jur.inscricaoEstadual = "95486325";
        System.out.println("Dados da pessoa Jurídica: ");
        System.out.println(jur.toString());

        
    }
}