package com.poo;

import main.java.com.poo.dominio.Models.Bootcamp;
import main.java.com.poo.dominio.Models.Curso;
import main.java.com.poo.dominio.Models.Mentoria;
import main.java.com.poo.dominio.Models.Aula;
import main.java.com.poo.dominio.Models.Dev;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bootcamp bootcampDIO = new Bootcamp();

        Curso cursoJava = new Curso("Curso Java Iniciante");

        cursoJava.addAula(new Aula("Historia", "http://host/curso/1/java"));

        Mentoria mentoriaJava = new Mentoria("Mentoria 1",new Aula("Tirando Duvidas!", "http://host/mentoria/1/java"));

        bootcampDIO.addCurso(cursoJava);
        bootcampDIO.addMentoria(mentoriaJava);
        
        Dev dev1 = new Dev("Texte 1", "");

        bootcampDIO.addDev(dev1);

        Dev dev2 = new Dev("Texte 2", "");

        bootcampDIO.addDev(dev2);

        System.out.println(bootcampDIO.toString());
        System.out.println(dev1.toString());
        System.out.println(dev2.toString());

        bootcampDIO.removeDev(dev2);

        System.out.println(bootcampDIO.toString());
        System.out.println(dev1.toString());
        System.out.println(dev2.toString());
    }
}
