package br.com.ebac.colecoesparte2;

import java.util.*;

public class Tarefa1 {
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite alguns nomes: ");
        System.out.println("Ex.: Eduardo,Amanda,Douglas");
        String nomes = teclado.next();
        teclado.close();

        String[] lista = nomes.split(",");

        List<String> listaNomesOrdenados = new ArrayList<String>();
        for(String nome : lista) listaNomesOrdenados.add(nome);
        Collections.sort(listaNomesOrdenados);

        System.out.println();

        System.out.println("Nomes Ordenados: ");
        for(String nome : listaNomesOrdenados)
            System.out.print(nome + " ");
    }
}
