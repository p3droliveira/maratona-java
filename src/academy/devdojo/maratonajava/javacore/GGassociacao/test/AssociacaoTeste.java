package academy.devdojo.maratonajava.javacore.GGassociacao.test;

import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.GGassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Pedro", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
