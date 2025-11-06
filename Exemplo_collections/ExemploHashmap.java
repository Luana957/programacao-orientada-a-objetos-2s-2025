package Exemplo_collections;

import java.util.HashMap;

public class ExemploHashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", "Brasília");
        capitais.put("Franca", "Paris");
        capitais.put("Japão", "Tóquio");
      
       System.out.println(capitais.get("Brasil"));

       if (capitais.containsKey("Argentina")) {
         System.out.println("Argentina esta na lista de capitais");
       }else{
        System.out.println("Argentina nao esta na lista de capitais");
       }
    
      for (String chave : capitais.keySet()){
        System.out.println(chave + "."+ capitais.get(chave));
      }
    }
}
