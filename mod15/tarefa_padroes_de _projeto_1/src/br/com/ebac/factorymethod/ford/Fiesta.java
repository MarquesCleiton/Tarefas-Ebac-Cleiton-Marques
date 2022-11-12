package br.com.ebac.factorymethod.ford;

import br.com.ebac.factorymethod.carro.AbstractCarro;
import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;

public class Fiesta extends AbstractCarro {

    public Fiesta(CarroFactory fabricante) {
        super(fabricante);
    }
}
