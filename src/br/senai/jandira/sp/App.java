package br.senai.jandira.sp;

import br.senai.jandira.sp.model.Caminhao;
import br.senai.jandira.sp.model.Carro;
import br.senai.jandira.sp.model.Moto;

public class App {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao();
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.andar();
        carro.fazerBarulho();
        carro.freiar();

        moto.andar();
        moto.fazerBarulho();
        moto.freiar();

        caminhao.andar();
        caminhao.fazerBarulho();
        caminhao.freiar();

    }
}
