package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;


import java.util.Scanner;
public class Zoomanagment {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of your zoo ");
        String name=sc.nextLine();
        System.out.println("Enter the name of cages ");

        int nbcages=sc.nextInt();
        System.out.println("My zoo " + name+" comporte "+nbcages+" cages")*/


        //Prosit 2

        //Sans Constructeur
        /*Animal animal1=new Animal();
        animal1.family="Dogs";
        animal1.name="Rex";
        animal1.age=3;
        animal1.isMammal=true;


        //System.out.println(animal1.name);
        Zoo Belvideres=new Zoo();
        Belvideres.animals[0]=animal1;
        Belvideres.city="Tunis";
        Belvideres.name="Belvideres";
        Belvideres.nbcages=25;
        //System.out.println(Belvideres.animals[0].name);*/
        //Avec Constructeur
        Animal animal1=new Animal("Dogs","Rex",12,true);
        Animal animal2=new Animal("Cats","Speedy",1,true);

        Zoo zoo1=new Zoo("Belvideres","Tunis");
        /*
        zoo1.DisplayZoo();
        System.out.println(zoo1);
        System.out.println(zoo1.toString());

        animal1.diplayAnimal();
        System.out.println(animal1);
        System.out.println(animal1.toString())
                */


        //Prosit3
        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        zoo1.DisplayAnimals();
        System.out.println(zoo1.getCount());
        zoo1.removeAnimal(animal1);
        zoo1.DisplayAnimals();
        System.out.println(zoo1.getCount());

        //int indexanimal=zoo1.Searchanimal(animal2);
        //System.out.println(zoo1.Searchanimal(animal2));
        //System.out.println(animal1.getName());
        System.out.println(zoo1.getAnimal(0).getName());
        Zoo zoo2=new Zoo("","Tunis");
        System.out.println(zoo2.getCity());


        }
}
