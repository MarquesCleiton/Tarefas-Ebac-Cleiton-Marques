package br.com.ebac.factorymethod;

import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;
import br.com.ebac.factorymethod.chevrolet.ChevroletFactory;
import br.com.ebac.factorymethod.fiat.FiatFactory;
import br.com.ebac.factorymethod.ford.FordFactory;
import br.com.ebac.factorymethod.wolks.WolksFactory;

public class App {
    public static void main(String[]args){
        CarroFactory fabrica = new ChevroletFactory();
        Carro carro = fabrica.criarCarro();
        carro.exibirInfo();

        System.out.println();

        fabrica = new FiatFactory();
        carro = fabrica.criarCarro();
        carro.exibirInfo();

        System.out.println();

        fabrica = new FordFactory();
        carro = fabrica.criarCarro();
        carro.exibirInfo();

        System.out.println();

        fabrica = new WolksFactory();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
    }
}
