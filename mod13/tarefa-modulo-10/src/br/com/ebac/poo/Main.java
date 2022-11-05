package br.com.ebac.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Cleiton");
        pessoaFisica.setCpf("123.456.789-12");
        pessoaFisica.setTelefone("(11)94002-8922");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Cleiton M.");
        pessoaJuridica.setCnpj("01.234.567/8912-34");
        pessoaJuridica.setNomeFantasia("Cleiton Company LTDA");
        pessoaJuridica.setTelefone("(11) 3224-4000");
        pessoaJuridica.setInscricaoEstadual("123456789");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoaFisica);
        pessoas.add(pessoaJuridica);

        imprimePessoas(pessoas);
    }

    private static void imprimePessoas(List<Pessoa> pessoas){
        for(Pessoa pessoa : pessoas){
            pessoa.imprimePessoa();
        }
    }
}
