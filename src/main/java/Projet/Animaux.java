package Projet;

import java.util.ArrayList;

public class Animaux {

    protected int age;
    protected int esperanceVie;
    protected String type;
    protected boolean ken;


    public void augmentationAge() {
       if (age <= esperanceVie) {
           age++;
       }
    };


    public Animaux(int age, int esperanceVie, String type, boolean ken) {
        this.age = age;
        this.esperanceVie = esperanceVie;
        this.type = type;
        this.ken = ken;
    }

    public boolean estMort(){
        if (age > esperanceVie){
            return true;
        }
        else {
            return false;
        }

    }
}
