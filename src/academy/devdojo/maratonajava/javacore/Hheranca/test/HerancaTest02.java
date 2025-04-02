package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar classe filha
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de superclase é criado e inicializado com valores default ou o que for passada
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em memória pro objeto da superclasse
    // 7 - Cada atributo de superclase é criado e inicializado com valores default ou o que for passada
    // 8 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da superclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Roberto");
    }
}
