package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Rafaela";
        estudante01.idade = 25;
        estudante01.sexo = 'F';

        estudante02.nome = "Daniela";
        estudante02.idade = 27;
        estudante02.sexo = 'F';

        estudante01.imprime();

        estudante02.imprime();
    }
}

