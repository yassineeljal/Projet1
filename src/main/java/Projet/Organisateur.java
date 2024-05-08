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
            if(animal.getType().equals("Lion") && (!animal.isReproductionFiniPourannee())){
                if(animal.reproduction()){
                    for(Animaux animal2: animaux)
                        if(animal.getType().equals("Lion") && !animal2.equals(animal) && (!animal2.isReproductionFiniPourannee())){
                            animaux.add(new Lion());
                            animal.setReproductionFiniPourannee(true);
                            animal2.setReproductionFiniPourannee(true);
                            break;
                    }
                }
            }
        }
        for (Animaux animal3: animaux) {
            if(animal3.getType().equals("Antilope") && (!animal3.isReproductionFiniPourannee())){
                if(animal3.reproduction()){
                    for(Animaux animal4: animaux)
                        if(animal4.getType().equals("Antilope") && !animal4.equals(animal3) && (!animal4.isReproductionFiniPourannee())){
                            animaux.add(new Lion());
                            animal3.setReproductionFiniPourannee(true);
                            animal4.setReproductionFiniPourannee(true);
                            break;
                        }
                }
            }
        }
    }




    public void manger(){
        vivant.clear();
        for (Animaux animal: animaux) {
            if(animal.getType().equals("Lion")){
                animal.manger(animaux);
                vivant.add(animal);
            }
            else {
                animal.manger(animaux);
                vivant.add(animal);
            }

        }
        animaux = vivant;
        vivant.clear();
    }
}
