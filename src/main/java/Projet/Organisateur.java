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
        vivant.clear();
        for (Animaux animal: animaux) {
            animal.augmentationAge();
            if(!animal.estMort()){
                vivant.add(animal);
            }
        }
        animaux = vivant;
        vivant.clear();
    }

    public void reproduirLion(){
        for (Animaux animal: animaux) {
            if(animal.getType().equals("Lion")){
                animal.reproduction();


            }
        }
    }

    Herbe herbe = new Herbe();
    public void manger(){
        for (Animaux animal: animaux) {

        }
    }
}
