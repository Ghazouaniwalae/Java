public class Zoo {
    Animal [] animals;
    String name;
    String city;
    static final int NBCAGES = 25;    int count = 0;
    public Zoo() {}
    Zoo (String name, String city, int nbcages) {
        animals = new Animal[nbcages];
        this.name=name;
        this.city=city;
    }

    void DisplayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("NBCages: "+nbcages);

    }
    @Override
    public String toString(){
        return name+"\n"+city+"\n"+nbcages;

    }
    boolean addAnimal(Animal a){
        if (count == nbcages)
        {
            System.out.println("Tout les Cage sont utulises");
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
    void DisplayAnimals(){
        for (int i=0; i<count; i++){
            animals[i].diplayAnimal();
        }

    }
    int Searchanimal(Animal a){
        for (int i=0;i<count;i++){
            if(animals[i].name.equals(a.name))
                return i;


        }
        return -1;
    }
    boolean removeAnimal(Animal a){
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
    boolean isFull()
    {
        if (count==NBCAGES)
            return true;
        return false;
    }

    Zoo comparer (Zoo a,Zoo b){
        if (a.count>b.count)
        {
            return a;
        } else if (a.count==b.count) {
            return null;

        }
        return b;

    }


}
