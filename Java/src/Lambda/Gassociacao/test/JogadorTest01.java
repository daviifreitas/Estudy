package Lambda.Gassociacao.test;

import Lambda.Gassociacao.domini.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("ROmário");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1,jogador3,jogador2};

        for (Jogador jogador : jogadores){
            jogador.imprimir();
        }

    }
}
