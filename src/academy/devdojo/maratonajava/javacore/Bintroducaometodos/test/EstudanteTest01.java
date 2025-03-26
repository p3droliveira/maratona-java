package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Rafaela";
        estudante1.idade = 25;
        estudante1.sexo = 'F';

        estudante2.nome = "Daniela";
        estudante2.idade = 27;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);

        impressora.imprime(estudante2);
    }
}
