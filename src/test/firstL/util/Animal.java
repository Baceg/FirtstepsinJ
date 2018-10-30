package test.firstL.util;

public class Animal {
    private String name;
    private int weight;
    private String unit = "kg";
    private int age;
    private int amount_of_legs;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal(String name, int weight, int age, int amount_of_legs) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.amount_of_legs = amount_of_legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmount_of_legs() {
        return amount_of_legs;
    }

    public void setAmount_of_legs(int amount_of_legs) {
        this.amount_of_legs = amount_of_legs;
    }
}
