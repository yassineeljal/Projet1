package Projet;

public class Animaux {

    protected int age;
    protected int esperanceVie;
    protected String type;
    protected boolean peutReproduire;

    public void reproduction(){
        if (age > 2){
            peutReproduire = true;
        }

    }


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

    public int getAge() {
        return age;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public String getType() {
        return type;
    }

    public boolean isPeutReproduire() {
        return peutReproduire;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEsperanceVie(int esperanceVie) {
        this.esperanceVie = esperanceVie;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPeutReproduire(boolean peutReproduire) {
        this.peutReproduire = peutReproduire;
    }
}
