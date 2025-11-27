package Atividade3_Final;


//Pessoa.java Classe abstrata (Nâo pode ser instanciada).
public abstract class Pessoa {
  private Integer id;
  private String nome;
  private String CPF;

  //Construtor
  public Pessoa (Integer id, String nome,String CPF ){
     this.id=id;
     this.nome=nome;
     this.CPF=CPF;
  }


   // Getters e Setteres
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cPF) {
    CPF = cPF;
  }

 // Método Abstrato - Define o comportamento polimórfico
 // As classes filhas (Paciente, Medico) SÃO OBRIGADAS a implementar este método.
public abstract String exibirDetalhes();


    
}
