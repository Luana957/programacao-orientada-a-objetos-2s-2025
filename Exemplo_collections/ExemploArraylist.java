package Exemplo_collections;

import java.util.ArrayList;

public class ExemploArrayList {
     public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Carol");

        for(String nome: listaNomes){
            System.out.println(nome);
        }

         
        System.out.println(listaNomes.get(1));

        if(listaNomes.contains("Bob")){
            System.out.println("Bob esta na lista");
        }else{
            System.out.println("Bob nao esta na lista");
        }
    
        listaNomes.remove("Bob");

        if(listaNomes.contains("Bob")){
            System.out.println("Bob esta na lista");
        }else{
            System.out.println("Bob nao esta na lista");
        }

        listaNomes.clear();

        if(listaNomes.isEmpty()){
            System.out.println("A lista esta vaza");
        }

      
    }
}
