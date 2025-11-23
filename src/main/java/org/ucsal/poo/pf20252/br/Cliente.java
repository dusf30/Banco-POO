package org.ucsal.poo.pf20252.br;
public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;

    public Cliente (String cpf, String endereco, String nome){
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}