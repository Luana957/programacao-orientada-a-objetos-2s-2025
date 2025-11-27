package Atividade3_Final;

// Paciente.java (Classe Concreta)
public class Paciente extends Pessoa{
    // Atributos específicos do Paciente
    private  String PlanoSaude;
    private  String HistoricoMedico;
   
   
    // Construtor- Chama o construtor da classe base (Pessoa)
    public Paciente(Integer id, String nome, String CPF, String planoSaude, String historicoMedico) {
        super(id, nome, CPF); // Inicializa id, nome, e cpf da classe Pessoa
        PlanoSaude = planoSaude;
        HistoricoMedico = historicoMedico;
    }
 
    // ⬇️ Demonstração de POLIMORFISMO ⬇️
    // Implementação OBRIGATÓRIA do método abstrato da classe Pessoa
    @Override
    public String exibirDetalhes() {
        // Monta uma String formatada, sem usar System.out.println()
        //Como e uma formatação(exibi texto) de dados nao priciso do System.out, ficaria mais flexivel nao preso ao terminal.
        return "--- DADOS DO PACIENTE ---\n" +
               "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "CPF: " + getCPF() + "\n" +
               "Plano de Saúde: " + PlanoSaude + "\n" +
               "Histórico: " + HistoricoMedico;
    }
    

 

}

