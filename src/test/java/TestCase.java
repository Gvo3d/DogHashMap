import dogs.*;
import org.junit.*;

/**
 * Created by Gvozd on 20.01.2016.
 */
public class TestCase {
    static DogFactory factory;

    @BeforeClass
    public static void getFactory(){
        factory = DogFactory.getInstance();
    }

    @Test
    public void dogsAndFactoryTest() {
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Assert.assertEquals("Asserting equalls to two null", false, dog.equals(dog2));
        Assert.assertEquals("Asserting zero hashCode for null dog", 0, dog.hashCode());

        factory.setDogStats(dog, "Vovka", 2);
        factory.setDogStats(dog2, "Vovka", 2);
        Assert.assertEquals("Asserting equals of two dogs", true, dog.equals(dog2));

        factory.setDogStats(dog2, "Vovka", 1);
        Assert.assertEquals("Asserting not equals of two dogs", false, dog.equals(dog2));

        factory.randomizeDogStats(dog);
        System.out.println("Random dog: "+dog.toString());

    }

    @Test
    public void dogMapTest(){
        DogHashMap dogmap = new DogHashMap();
        dogmap.generateDogs(5);
        dogmap.printSize();
        dogmap.printAllDogs();
    }
}
