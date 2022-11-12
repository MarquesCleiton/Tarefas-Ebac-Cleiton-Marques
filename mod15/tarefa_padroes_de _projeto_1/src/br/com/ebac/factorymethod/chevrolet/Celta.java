package br.com.ebac.factorymethod.chevrolet;

import br.com.ebac.factorymethod.carro.AbstractCarro;
import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;

public class Celta extends AbstractCarro {

    public Celta(CarroFactory fabricante) {
        super(fabricante);
    }
}
