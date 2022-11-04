package br.com.ebac.colecoesparte2;

import java.util.*;

public class Tarefa2 {
    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite alguns nomes e seus respectivos sexos: ");
        System.out.println("Ex.: Eduardo-m,Amanda-f,Douglas-m");
        String nomes = teclado.next();
        teclado.close();

        String[] lista = nomes.split(",");

        List<String> listaNomesOrdenados = new ArrayList<String>();
        Collections.addAll(listaNomesOrdenados, lista);
        Collections.sort(listaNomesOrdenados);

        String nomesFemininos = "\n";
        String nomesMaculinos = "\n";

        for(String nome : listaNomesOrdenados){
            String[] nomeSexo = nome.split("-");
            if(nomeSexo[1].equals("f"))
                nomesFemininos += nomeSexo[0]+"\n";
            else
                nomesMaculinos += nomeSexo[0]+"\n";
        }

        System.out.println("Nomes Femininos: " + nomesFemininos);
        System.out.println("Nomes Masculinos: " + nomesMaculinos);
    }
}
