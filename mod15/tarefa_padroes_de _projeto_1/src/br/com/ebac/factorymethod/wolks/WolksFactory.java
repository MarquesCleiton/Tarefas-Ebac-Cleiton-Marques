package br.com.ebac.factorymethod.wolks;

import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;
import br.com.ebac.factorymethod.ford.Fiesta;

public class WolksFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new Fiesta(this);
    }
}
