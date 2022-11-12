package br.com.ebac.factorymethod.carro;

public abstract class AbstractCarro implements Carro{
    private CarroFactory fabricante;

    public AbstractCarro(CarroFactory fabricante){
        this.fabricante = fabricante;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + this.getClass().getSimpleName());
        System.out.println("Fabricado por: " + fabricante.getClass().getSimpleName());
    }
}
