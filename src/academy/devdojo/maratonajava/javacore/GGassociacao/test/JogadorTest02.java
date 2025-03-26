package academy.devdojo.maratonajava.javacore.GGassociacao.test;

import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();

    }
}
