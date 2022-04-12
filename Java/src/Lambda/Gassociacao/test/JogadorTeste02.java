package Lambda.Gassociacao.test;

import Lambda.Gassociacao.domini.Jogador;
import Lambda.Gassociacao.domini.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele´");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprimir();
    }
}
