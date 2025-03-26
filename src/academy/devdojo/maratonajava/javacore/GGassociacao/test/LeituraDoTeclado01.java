package academy.devdojo.maratonajava.javacore.GGassociacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("------------------------");
        System.out.println("Nome "+nome);
        System.out.println("Nome "+idade);
        System.out.println("Nome "+sexo);

    }
}
