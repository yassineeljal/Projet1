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

    public void vieillir() {
        for (Animaux animal: animaux) {
            animal.augmentationAge();
            animal.estMort();
        }
    }

    public void reproduir(){
        for (Animaux animal: animaux) {

        }
    }

    public void graille(){
        for (Animaux animal: animaux) {

        }
    }
}
