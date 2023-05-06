package main.java.com.poo.dominio.Models;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String name;
    private String bio;
    private List<Bootcamp> bootcamps;

    public Dev(String name, String bio){
        this.name = name;
        this.bio = bio;
        this.bootcamps = new ArrayList<>();
    }

    public void matricularBootcamp(Bootcamp bootcamp){
        this.bootcamps.add(bootcamp);
    }

    public void desmatricularBootcamp(Bootcamp bootcamp){
        this.bootcamps.remove(this.bootcamps.indexOf(bootcamp));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", bio='" + getBio() + "'" +
            ", bootcamps='" + this.bootcamps + "'" +
            "}";
    }

}
