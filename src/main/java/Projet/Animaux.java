package Projet;

public class Animaux {

    protected int age;
    protected int esperanceVie;
    protected String type;
    protected boolean peutReproduire;


    public void augmentationAge() {
       if (age <= esperanceVie) {
           age++;
       }
    };


    public Animaux(int age, int esperanceVie, String type, boolean peutReproduire) {
        this.age = age;
        this.esperanceVie = esperanceVie;
        this.type = type;
        this.peutReproduire = peutReproduire;
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
