package br.com.ebac.factorymethod.chevrolet;

import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;

public class ChevroletFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new Celta(this);
    }
}
