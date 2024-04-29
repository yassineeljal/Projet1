package Projet;

public class Animaux {

    protected int age;
    protected int esperenceVie;
    protected String type;


    public Animaux( int age, int esperenceVie, String type ) {
        this.age = age;
        this.esperenceVie = esperenceVie;
        this.type = type;
    }

    public boolean estMort(){
        if (age > esperenceVie){
            return true;
        }
        else {
            return false;
        }
    }
}
