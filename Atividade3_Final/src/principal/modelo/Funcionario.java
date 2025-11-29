package Atividade3_Final.src.principal.modelo;

// Funcionario.java (Classe Abstrata)
public abstract class Funcionario extends Pessoa {
    // Atributos específicos do Funcionario
    private  String Matricula;
    private   Double Salario;




 //Construtor
  public Funcionario (Integer id, String nome, String CPF, String Matricula, Double Salario){
     super(id, nome, CPF);
     this.Matricula=Matricula;
     this.Salario=Salario;
 }


  
// Getters e Setters (Encapsulamento)

  public String getMatricula() {
    return Matricula;
  }




  public void setMatricula(String matricula) {
    Matricula = matricula;
  }




  public Double getSalario() {
    return Salario;
  }




  public void setSalario(Double salario) {
    if (Salario < 0){
        System.out.println("Salário não pode ser negativo.");
        return;
    }
    this.Salario = salario;
  }




}