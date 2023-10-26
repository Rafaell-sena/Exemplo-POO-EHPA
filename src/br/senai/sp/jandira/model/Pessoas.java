package br.senai.sp.jandira.model;

public class Pessoas extends  Diario implements Conta {

    private String nome;
    private int idade;

    public void notaFinal(double nota1, double nota2){
        System.out.println("O Nome do Aluno é " + getNome());
        double media =calcularNota(nota1, nota2);
        System.out.println("Sua Nota Final é " + media);
    }


    public  void passarTempo(){
        System.out.println("A Pessoa está passando tempo...");
    }

    public Pessoas (String nome, int idade){
       this.nome = nome;
       this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
