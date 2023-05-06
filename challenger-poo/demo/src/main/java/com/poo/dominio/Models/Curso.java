package main.java.com.poo.dominio.Models;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String title;
    private List<Aula> aulas;

    public Curso(String title){
        this.title = title;
        this.aulas = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAula(Aula aula){
        this.aulas.add(aula);
    }

    public void removeAula(Aula aula){
        this.aulas.remove(aula);
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", aulas='" + this.aulas + "'" +
            "}";
    }

}
