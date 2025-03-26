package academy.devdojo.maratonajava.javacore.GGassociacao.test;

import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konora", professores );

        escola.imprime();
    }
}
