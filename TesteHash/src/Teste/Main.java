package Teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Criando
        ArrayList<String> nome = new ArrayList<String>();
        System.out.println("Inserindo");
        nome.add("Dheniel");
        nome.add("Rodrigues");
        nome.add("Luis");
        nome.add("do Carmo");
        
        for(int i = 0; i < nome.size();i++){
            System.out.println(nome.get(i));
        }
        System.out.println("\nRemovendo");
        nome.remove(3);
        
        for(String nomes : nome){
            System.out.println(nomes);
        }
        
        System.out.println("\nOrdenando");
        Collections.sort(nome);
        
        for(String nomes : nome){
            System.out.println(nomes);
        }
        
        System.out.println("\nRe-ordenando");
        Collections.sort(nome, Collections.reverseOrder());
        
        for(String nomes : nome){
            System.out.println(nomes);  
        } 
        
        HashMap<String, String> nomeCompleto = new HashMap<>();
        System.out.println("\n");
        nomeCompleto.put("Dheniel", "Rodrigues");
        nomeCompleto.put("Joao","Silva");
        nomeCompleto.put("Jose","Santos");
        
        System.out.println("\n" + nomeCompleto);
        
        nomeCompleto.remove("Jose");
        System.out.println("\n");
        System.out.println(nomeCompleto);
        System.out.println("\n"+ nomeCompleto.containsKey("Dheniel"));
        System.out.println("\n"+ nomeCompleto.containsValue("Santos"));
        
        for(String chave : nomeCompleto.keySet()){
            System.out.println(chave + " / " + nomeCompleto.get(chave));
        }
        
        /*
        As principais diferenças são:
        
        Map: É uma interface que define o contrato para objetos que armazenam pares chave-valor. 
        Não é uma implementação em si, mas sim um contrato que as outras classes implementam. 
        
        HashMap: Utiliza uma tabela hash para armazenamento, fornecendo acesso rápido às chaves e valores. 
        Não garante nenhuma ordenação, ou seja, a ordem em que os elementos são inseridos pode ser diferente da ordem em que são iterados. 
        
        TreeMap: Utiliza uma árvore vermelha-preta para armazenamento. 
        Isso garante que as chaves sejam ordenadas (naturalmente ou por um comparator fornecido). O acesso a elementos é logarítmico.
        
        LinkedHashMap: Utiliza uma tabela hash interna e uma lista encadeada para manter a ordem de inserção dos elementos. 
        Isso garante que a ordem em que os elementos são inseridos é a mesma em que são iterados. 
        O acesso a elementos é, em média, tempo constante, mas a manutenção da lista encadeada pode ter um custo. 
        */
    }
}
    

