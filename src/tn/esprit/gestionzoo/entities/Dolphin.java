package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;

    }

    public String toString(){
        return super.toString() + "\nSwimmingSpeed : "+ swimmingSpeed;
    }
    @Override
    public void swim(){
        System.out.println("This Dolphin is Swimming");
    }

    @Override
    public float getSwimmingDepth(){
        return 0;
    }
}
