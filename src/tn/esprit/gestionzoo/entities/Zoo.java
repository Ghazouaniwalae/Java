package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal [] animals;
    private String name;
    private String city;
    private static final int nbcages = 25;
    private static final int nbaquatic = 10;
    private int count = 0;
    private Aquatic[] aquaticAnimals;
    private int aquaticCount = 0;




    public Zoo() {}
    public Zoo (String name, String city) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: Zoo Name cannot be empty");
            return;
        }
        aquaticAnimals=new Aquatic[nbaquatic];
        animals = new Animal[nbcages];
        this.name=name;
        this.city=city;
    }

    public void DisplayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("NBCages: "+nbcages);

    }
    @Override
    public String toString(){
        return name+"\n"+city+"\n"+nbcages;

    }
    public boolean addAnimal(Animal a){
        if (isFull()){
            System.out.println("Tout les cages sont occupees");
            return false;
        }
        if ( this.Searchanimal(a)!=-1)
        {
            System.out.println("Animal existant");
            return false;
        }
        animals[count]=a;
        count++;
        return true;


    }
    public void DisplayAnimals(){
        for (int i=0; i<count; i++){
            animals[i].diplayAnimal();
        }

    }
    public int Searchanimal(Animal a){
        for (int i=0;i<count;i++){
            if(animals[i].getName().equals(a.getName()))
                return i;


        }
        return -1;
    }
    public boolean removeAnimal(Animal a){
        int index = Searchanimal(a);
        if (index == -1)
        {
            System.out.println("animal non trouve");
            return false;
        }
        animals[index]=null;
        for (int i=index;i<count;i++){
            animals[i]=animals[i+1];
        }
        count--;
        return true;
    }
    public boolean isFull()
    {
        if (count==nbcages)
            return true;
        return false;
    }

    public Zoo comparer (Zoo a,Zoo b){
        if (a.count>b.count)
        {
            return a;
        } else if (a.count==b.count) {
            return null;

        }
        return b;

    }
    public int getCount(){
        return count;
    }
    public Animal getAnimal(int index){
        return animals[index];
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }



    public void addAquaticAnimal(Aquatic aquatic){
        if (aquaticCount==10)
        {
            System.out.println("Aquaticanimals is Full");
            return;
        }
        aquaticAnimals[aquaticCount++]=aquatic;


    }


    public void swim(){
        for (int i =0;i<aquaticCount;i++){
            aquaticAnimals[i].swim();
        }
    }



    public float maxPenguinSwimmingDepth(){
        float max=0;
        for (int i=0;i<aquaticCount;i++){
            if (aquaticAnimals[i].getSwimmingDepth()>max){
                max=aquaticAnimals[i].getSwimmingDepth();
            };

        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int numOfDolphins=0;
        int numOfPenguins=0;
        for (int i=0;i<aquaticCount;i++){
            if (aquaticAnimals[i] != null) {
                if (aquaticAnimals[i].getClass() == Dolphin.class) {
                    numOfDolphins++;
                } else numOfPenguins++;
            }


        }
        System.out.println("Number of Dolphins : "+numOfDolphins);
        System.out.println("Number of Penguins : "+numOfPenguins);
    }
}
