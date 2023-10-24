package br.senai.jandira.sp.model;

public class Caminhao implements Veiculo{


    @Override
    public void andar() {
        System.out.println(" O Caminhao está andando!");
    }

    @Override
    public void freiar() {
        System.out.println(" O Caminhao está freiando");

    }

    @Override
    public void fazerBarulho() {

        System.out.println("Rannnn Iuuuuu");
    }
}
