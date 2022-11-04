package br.com.ebac.tarefacalculomedia;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String [] args){

        float somaNotas = 0;
        float nota = 0;
        String mensagem = "Média = (";
        String resultado = "";

        Scanner teclado = new Scanner(System.in);

        int quantidadeNotas = 4;
        for(int i = 1; i <= quantidadeNotas; i++){
            System.out.println("Digite a " + i +"º nota");
            nota = teclado.nextInt();
            somaNotas += nota;
            if(i == quantidadeNotas)
                continue;
            mensagem += nota + " + ";
        }

        float media = somaNotas / 4;
        mensagem += nota + ")/4 = " + media;

        System.out.println();
        System.out.println(mensagem);
        System.out.println();

        if(media >= 7){
            resultado = "APROVADO";
        }else if(media >= 5){
            resultado = "RECUPERAÇÃO";
        }else{
            resultado = "REPROVADO";
        }

        System.out.println("Resumo **********************");
        System.out.println("A média das notas é: " + media);
        System.out.println("Situação: " + resultado);
        System.out.println("*****************************");

        teclado.close();
    }
}
