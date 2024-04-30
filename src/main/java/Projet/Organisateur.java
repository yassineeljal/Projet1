package Projet;

import java.util.ArrayList;

public class Organisateur {
    public void setAnimaux(ArrayList<Animaux> animaux) {
        this.animaux = animaux;
    }

    public ArrayList<Animaux> getAnimaux() {
        return animaux;
    }

    ArrayList<Animaux> animaux = new ArrayList<Animaux>();
    ArrayList<Animaux> vivant = new ArrayList<Animaux>();

    public void vieillir() {
        for (Animaux animal: animaux) {
            animal.augmentationAge();
            if(!animal.estMort()){
                vivant.add(animal);
            }
        }
        animaux = vivant;
    }

    public void reproduir(){
        for (Animaux animal: animaux) {

        }
    }

    Herbe herbe = new Herbe();
    public void manger(){
        for (Animaux animal: animaux) {

        }
    }


}
