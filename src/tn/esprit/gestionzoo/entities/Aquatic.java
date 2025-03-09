package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.main.InvalidAgeException;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public abstract  void swim();

    public abstract  float getSwimmingDepth();


    public boolean equals( Aquatic b) {
        if(this.habitat.equals(b.habitat) && this.getAge()==b.getAge() && this.getName().equals(b.getName())) return true;
        return false;
    }
}
