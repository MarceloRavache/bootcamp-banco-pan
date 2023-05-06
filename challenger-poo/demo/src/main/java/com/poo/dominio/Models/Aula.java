package main.java.com.poo.dominio.Models;

public class Aula {
    private String title;
    private String conteudoFilePath;

    public Aula(String title, String conteudoFilePath){
        this.title = title;
        this.conteudoFilePath = conteudoFilePath;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConteudoFilePath() {
        return this.conteudoFilePath;
    }

    public void setConteudoFilePath(String conteudoFilePath) {
        this.conteudoFilePath = conteudoFilePath;
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", conteudoFilePath='" + getConteudoFilePath() + "'" +
            "}";
    }

}
