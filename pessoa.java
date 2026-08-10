package java;

public class Pessoa {
    
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public void apresentar(){
        System.out.println("Nome:"+nome+"|idade:"+ idade);
    }
}
