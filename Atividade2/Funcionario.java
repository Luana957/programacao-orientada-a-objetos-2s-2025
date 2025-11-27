public class Funcionario extends Pessoa{
 private String cargo;
  
 public Funcionario (String nome,String email,String cargo){
    super(nome, email);
    this.cargo = cargo;


    @Override
    public void exibirInfor(){
        super.exibirinfor();
        System.out.println("Cargo: "+cargo);
    }
}


}