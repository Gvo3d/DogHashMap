package dogs;

/**
 * Created by Gvozd on 20.01.2016.
 */
public class Dog {
    private int age;
    private String name;

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Dog tempdog = (Dog) obj;

        if (age != tempdog.getAge()) return false;
        if ((name==null)||name != tempdog.getName()) return false;
        return name.equals(tempdog.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        if (name!=null) result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
