package br.com.ebac.exerciciomod07;

public class Main {
    public static void main(String[]args){
        AgendaTelefonica agendaTelefonica = new AgendaTelefonica();
        agendaTelefonica.setNome("Cleiton Marques");
        agendaTelefonica.setApelido("Clei");
        agendaTelefonica.setCelular(12345678);
        agendaTelefonica.setTelefoneFixo(87654321);
        agendaTelefonica.setEndereco("Rua da programação, nº42");
        agendaTelefonica.setEmail("cleiton@gmail.com");

        agendaTelefonica.exibeAgenda();
        agendaTelefonica.exibeAgendaTelefonica();
    }
}
