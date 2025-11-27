

public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula){
        super(nome,email);
        this.matricula=matricula;
    }
     
    @Override
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("Matricula: "+ matricula);
    }

} 
