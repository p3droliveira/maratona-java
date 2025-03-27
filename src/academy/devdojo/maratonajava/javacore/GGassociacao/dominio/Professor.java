package academy.devdojo.maratonajava.javacore.GGassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidades;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidades) {
        this.nome = nome;
        this.especialidades = especialidades;
    }

    public Professor(String nome, String especialidades, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidades = especialidades;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("----------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndeco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno :" + aluno.getNome() + " idade: " + aluno.getIdade());

            }


        }

    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
