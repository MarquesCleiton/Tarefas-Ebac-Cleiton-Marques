package br.com.ebac.exerciciomod07;

public class Main {
    public static void main(String[]args){
        ContatoTelefonico contatoTelefonico = new ContatoTelefonico();
        contatoTelefonico.setNome("Cleiton Marques");
        contatoTelefonico.setApelido("Clei");
        contatoTelefonico.setCelular(12345678);
        contatoTelefonico.setTelefoneFixo(87654321);
        contatoTelefonico.setEndereco("Rua da programação, nº42");
        contatoTelefonico.setEmail("cleiton@gmail.com");

        contatoTelefonico.exibeContato();
        contatoTelefonico.exibeContatoTelefonico();
    }
}
