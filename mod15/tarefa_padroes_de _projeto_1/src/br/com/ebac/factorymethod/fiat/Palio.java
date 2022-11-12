package br.com.ebac.factorymethod.fiat;

import br.com.ebac.factorymethod.carro.AbstractCarro;
import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;

public class Palio extends AbstractCarro {

    public Palio(CarroFactory fabricante) {
        super(fabricante);
    }
}
