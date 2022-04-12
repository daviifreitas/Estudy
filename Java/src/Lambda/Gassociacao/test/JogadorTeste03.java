package Lambda.Gassociacao.test;

import Lambda.Gassociacao.domini.Jogador;
import Lambda.Gassociacao.domini.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};
        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----Jogador-----");
        jogador1.imprimir();

        System.out.println("----Time-----");
        time.imprime();


    }
}
