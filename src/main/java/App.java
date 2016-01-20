import dogs.Dog;
import dogs.DogFactory;
import dogs.DogHashMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gvozd on 20.01.2016.
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] { "config.xml" });


        DogHashMap dogsCollection = (DogHashMap) appContext.getBean("doghashmap");
        DogFactory factory = (DogFactory) appContext.getBean("dogfactory");
        Dog tempdog =(Dog) appContext.getBean("dog");

        tempdog = factory.createDog();
        factory.setDogStats(tempdog, "titan", 5);
        dogsCollection.putADog(tempdog);

        dogsCollection.generateDogs(999);
        dogsCollection.printSize();
        dogsCollection.printAllDogs();
    }
}
