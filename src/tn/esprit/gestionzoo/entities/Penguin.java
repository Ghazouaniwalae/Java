package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.main.InvalidAgeException;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;

    }

    public String toString(){
        return super.toString() + "\nSwimmingDepth : "+ swimmingDepth;

    }
    @Override
    public void swim(){
        System.out.println("This Penguin is Swimming");
    }

    public float getSwimmingDepth(){
        return swimmingDepth;
    }


}
