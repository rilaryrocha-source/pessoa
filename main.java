package java;
public class main {

    public static void Pessoa(String[] args) {

        Pessoa Pessoa1 = new Pessoa("Joao",20 );

        Pessoa pessoa2 = new Pessoa(
            "Maria Antonia",
            12
        );

         Pessoa pessoa3 = new Pessoa("Nemo", 20);

        Pessoa[] acervo = {
            Pessoa1,
            pessoa2,
            pessoa3
        };

        for (Pessoa pessoa :acervo){
            pessoa.apresentar();
            System.out.println("______________");
        }

    }
}
