package academy.devdojo.maratonajava.introducao;
/*
Prática

 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercio {
    public static void main(String[] args) {
        String nome = "Roberto";
        String endereco = "Av. João Paulo,";
        double salario = 4200.99;
        String dataRecebimentoSalario = "30/01/2025.";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }
}
