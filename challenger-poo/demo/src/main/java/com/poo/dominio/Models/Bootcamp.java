package main.java.com.poo.dominio.Models;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private List<Mentoria> mentorias;
    private List<Curso> cursos;
    private List<Dev> devs;

    public Bootcamp(){
        this.mentorias = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public void addDev(Dev dev){
        this.devs.add(dev);
        dev.matricularBootcamp(this);
    }

    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    public void addMentoria(Mentoria mentoria){
        this.mentorias.add(mentoria);
    }

    public void removeDev(Dev dev){
        this.devs.remove(this.devs.indexOf(dev));
        dev.desmatricularBootcamp(this);
    }

    public void removeCurso(Curso curso){
        this.cursos.remove(curso);
    }

    public void removeMentoria(Mentoria mentoria){
        this.mentorias.remove(mentoria);
    }

    @Override
    public String toString() {
        return "{" +
            " mentorias='" + this.mentorias + "'" +
            ", cursos='" + this.cursos + "'" +
            "}";
    }

}
