class aluno extends pessoa{
    constructor (nome, idade){
        this.nome= nome;
        this.idade= idade;
    }

    apresentar(){
        console.log(`nome:${this.nome} | idade:${this.idade} | CGM:${this.cgm}`);
    }
}

const pessoa=new pessoa("João,20");
pessoa.apresentar();
