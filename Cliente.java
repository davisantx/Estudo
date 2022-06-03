package com.mycompany.supermercado;

public class Cliente extends Entidade {
    protected String nome;
    protected String cpf;
    protected String numTelefone;
    Cartao cartao;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }
    
    Cliente(String nomeCliente, String cpf, Cartao cartao) {
      this.nome = nomeCliente;
      this.cpf = cpf;
      this.cartao = cartao;
    }
}
