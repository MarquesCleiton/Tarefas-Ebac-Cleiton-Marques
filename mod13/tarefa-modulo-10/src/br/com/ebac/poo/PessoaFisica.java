package br.com.ebac.poo;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica() {}

    public PessoaFisica(String nome, String cpf, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void imprimePessoa() {
        System.out.println("********************************");
        System.out.println("Pessoa Física E=mc²");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("********************************");
    }
}
