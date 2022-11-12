package br.com.ebac.factorymethod.fiat;

import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;

public class FiatFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new Palio(this);
    }
}
