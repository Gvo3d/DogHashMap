package dogs;

import java.util.Random;

/**
 * Created by Gvozd on 20.01.2016.
 */
public class DogFactory {
    private int dogNameLength=3;
    private int maxDogAge=3;
    private String characters="abcdefghijklmnoprstuqxyz";
    private static DogFactory instance = new DogFactory();

    private DogFactory() {
    }

    public int getDogNameLength() {
        return dogNameLength;
    }

    public void setDogNameLength(int dogNameLength) {
        this.dogNameLength = dogNameLength;
    }

    public int getMaxDogAge() {
        return maxDogAge;
    }

    public void setMaxDogAge(int maxDogAge) {
        this.maxDogAge = maxDogAge;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public static DogFactory getInstance() {
        return instance;
    }

    public Dog createDog() {
        return new Dog();
    }

    public void randomizeDogStats(Dog dog) {
        Random rand = new Random();
        int tempDogAge = rand.nextInt(maxDogAge);
        dog.setAge(tempDogAge);
        dog.setName(generateDogName());
    }

    public void setDogStats(Dog dog, String name, int age) {
        dog.setName(name);
        dog.setAge(age);
    }

    private String generateDogName() {
        Random rng = new Random();

        char[] text = new char[dogNameLength];
        for (int i = 0; i < dogNameLength; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
