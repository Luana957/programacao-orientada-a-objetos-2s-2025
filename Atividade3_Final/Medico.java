package Atividade3_Final;

// Medico.java (Classe Concreta)
public class Medico extends Funcionario{
    // Atributos específicos do Medico
    private String CRM;
    private String Especialidade;


// Construtor - Chama o construtor da classe base (Funcionario)
public Medico (int id, String nome, String CPF,String Matricula, Double Salario, String CRM,String Especialidade){
    super(id,nome,CPF,Matricula, Salario);
    this.CRM= CRM;
    this.Especialidade = Especialidade;

}

//  Demonstração de POLIMORFISMO 
    // Implementa o método abstrato herdado de Pessoa (via Funcionario)
    @Override
    public String exibirDetalhes() {
        // Monta a String com todos os dados: Pessoa, Funcionario e Medico
        return "--- DADOS DO MÉDICO(A) ---\n" +
               "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "CPF: " + getCPF() + "\n" +
               "Matrícula: " + getMatricula() + "\n" +
               "Salário: R$" + getSalario() + "\n" +
               "CRM: " + CRM + "\n" +
               "Especialidade: " + Especialidade;
    }
    
      // Getters e Setters (Encapsulamento)
    public String getCRM() {
        return CRM;
    }

    public void setCRM(String cRM) {
        CRM = cRM;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

    

}