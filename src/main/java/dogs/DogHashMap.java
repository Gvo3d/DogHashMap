package dogs;

import java.util.HashMap;

/**
 * Created by Gvozd on 20.01.2016.
 */
public class DogHashMap {
    private HashMap dogmap = new HashMap();
    private DogFactory factory = DogFactory.getInstance();

    public void setFactory(DogFactory factory) {
        this.factory = factory;
    }

    public void printAllDogs() {
        dogmap.forEach((k, v) -> System.out.println("HashKey : " + k + " Item : " + v));
    }

    public void printSize() {
        System.out.println("HashMap has " + dogmap.size() + " dogs.");
    }

    public void generateDogs(int counter) {
        for (int i = 0; i < counter; i++) {
            Dog tempdog = factory.createDog();
            factory.randomizeDogStats(tempdog);
            dogmap.put(tempdog.hashCode(), tempdog);
        }
    }

    public void putADog(Dog dog) {
        dogmap.put(dog.hashCode(), dog);
    }


}
