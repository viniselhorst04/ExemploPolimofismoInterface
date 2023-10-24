package br.senai.jandira.sp.model;

public class Moto implements Veiculo{

    @Override
    public void andar() {
        System.out.println("A moto está andando... ");
    }

    @Override
    public void freiar() {
        System.out.println("A moto está freando... ");

    }

    @Override
    public void fazerBarulho() {
        System.out.println("Randandandandan");

    }
}
