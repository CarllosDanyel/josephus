import java.util.*;
class Pessoa {
    String nome;
    String cpf;
    int numero;
    Pessoa(String nome, String cpf, int numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
    }
}


public class josephus {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        
        pessoas.add(new Pessoa("joao", "CPF 324.534.64-43", 53462723));
        pessoas.add(new Pessoa("maria", "CPF 337.536.51-02", 14576925));
        pessoas.add(new Pessoa("jose", "CPF 237.958.302-12", 18647291));
       
        int k = 1; 
        int index = 1;

        while (pessoas.size() > 1) {
            index = (index + k - 1) % pessoas.size();
            Pessoa pessoaRemovida = pessoas.remove(index);
            System.out.println("Pessoa removida: " + pessoaRemovida.nome);
        }

        
        Pessoa sobrevivente = pessoas.get(0);
        System.out.println("Sobrevivente: " + sobrevivente.nome + " cpf: " + sobrevivente.cpf + " numero: " + sobrevivente.numero);
    }
}
    
    
