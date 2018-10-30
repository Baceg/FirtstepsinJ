package test.main;

//import java.util.Objects;

public class Plant {
    protected String name;
    public static int counter = 0;

    public Plant(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                '}';
    }

}
