package br.com.ebac.factorymethod.wolks;

import br.com.ebac.factorymethod.carro.AbstractCarro;
import br.com.ebac.factorymethod.carro.Carro;
import br.com.ebac.factorymethod.carro.CarroFactory;

public class Gol extends AbstractCarro {

    public Gol(CarroFactory fabricante) {
        super(fabricante);
    }
}
