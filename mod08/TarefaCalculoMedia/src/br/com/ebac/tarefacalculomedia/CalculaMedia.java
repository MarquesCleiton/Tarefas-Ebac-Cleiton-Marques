package br.com.ebac.tarefacalculomedia;

public class CalculaMedia {
    public static void main(String [] args){
        float nota1 = 5;
        float nota2 = 6;
        float nota3 = 7;
        float nota4 = 8;

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 1: " + nota2);
        System.out.println("Nota 1: " + nota3);
        System.out.println("Nota 1: " + nota4);

        System.out.println("Média = (" + nota1 + " + " + nota2 + " + " + nota3 + " + " + nota4 + ")/4 = " + media);

        System.out.println();

        System.out.println("Resumo **********************");
        System.out.println("A média das notas é: " + media);
        System.out.println("APROVADO: " + (media >= 6.0));
        System.out.println("*****************************");

    }
}
