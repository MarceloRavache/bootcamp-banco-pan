package main.java.com.poo.dominio.Models;

public class Mentoria {
    private String title;
    private Aula mentoria;

    public Mentoria(String title, Aula mentoria){
        this.title = title;
        this.mentoria = mentoria;
    }

    public Aula getMentoria() {
        return this.mentoria;
    }

    public void setMentoria(Aula mentoria) {
        this.mentoria = mentoria;
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + this.title + "'" +
            ", mentoria='" + getMentoria() + "'" +
            "}";
    }

}
