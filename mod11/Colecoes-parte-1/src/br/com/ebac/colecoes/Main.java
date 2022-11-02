package br.com.ebac.colecoes;

import java.util.*;

public class Main {
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        List<Pessoa> listaPessoasSexofeminino = new ArrayList<Pessoa>();
        List<Pessoa> listaPessoasSexoMasculino = new ArrayList<Pessoa>();

        System.out.println("Quantas pessoas deseja cadastrar?");
        int quantidadeCadastro = teclado.nextInt();

        int contador = 1;
        while(contador <= quantidadeCadastro) {
            System.out.print("Digite o nome da " + contador + "º pessoa: ");
            String nome = teclado.next();
            System.out.print("Digite o sexo(f/m): ");
            char sexo = teclado.next().charAt(0);

            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Sexo digitado inválido. Por favor, digitar apenas f para feminino ou m para masculino ");
                continue;
            }

            if(sexo == 'f')
                listaPessoasSexofeminino.add(new Pessoa(nome,sexo));
            else
                listaPessoasSexoMasculino.add(new Pessoa(nome,sexo));

            contador++;
        }

        Collections.sort(listaPessoasSexofeminino);
        Collections.sort(listaPessoasSexoMasculino);

        System.out.println();

        System.out.println("Pessoas do sexo Feminino : " + listaPessoasSexofeminino);
        System.out.println("Pessoas do sexo Masculino: " + listaPessoasSexoMasculino);
    }
}
