package br.com.ebac.poo;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String nomeFantasia;
    private String inscricaoEstadual;

    public PessoaJuridica() {}

    public PessoaJuridica(String nome, String nomeFantasia, String cnpj, String inscricaoEstadual, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public void imprimePessoa() {
        System.out.println("********************************");
        System.out.println("Pessoa Jurídica");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nome Fantasia: " + this.getNomeFantasia());
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Numero inscrição estadual: " + this.getInscricaoEstadual());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("********************************");

    }
}
