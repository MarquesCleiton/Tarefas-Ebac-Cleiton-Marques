package br.com.ebac.factorymethod.ford;

import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;

public class FordFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new Fiesta(this);
    }
}
