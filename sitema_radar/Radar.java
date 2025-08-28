package sitema_radar;

public class Radar {
    public Integer  limiteVelocidade;
    public String localidade;

    public void avaliarVelocidade(Carro carro){
          if(carro.velocidade > this.limiteVelocidade){
            //emitir notificacao
            emitirNotificacao(carro.placa, carro.velocidade);
    
          }
    }
    
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
           System.out.println("Placa "+placa);
           System.out.println("Velocidade: "+velocidadeObservada);
           System.out.println("Limite da via: "+this.limiteVelocidade);
    }
}
