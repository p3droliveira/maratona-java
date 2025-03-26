package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domino.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corola";
        carro1.modelo = "Sedan";
        carro1.ano = 2024;

        carro2.nome = "HRV";
        carro2.modelo = "SUV";
        carro2.ano = 2025;

        System.out.println("Nome:" + carro1.nome + " Modelo:" + carro1.modelo + " Ano:" + carro1.ano);
        System.out.println("\nNome:" + carro2.nome + " Modelo:" + carro2.modelo + " Ano:" + carro2.ano);

    }
}

