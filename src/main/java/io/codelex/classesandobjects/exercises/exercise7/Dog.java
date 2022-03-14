package io.codelex.classesandobjects.exercises.exercise7;

public class Dog {
    private final String name;
    private final Gender sex;
    private Dog father;
    private Dog mother;

    public Dog(String name, Gender sex, Dog mother, Dog father) {
        this.name = name;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
    }

    public Dog(String name, Gender sex, Dog mother) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
    }

    public Dog(String name, Gender sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getFatherName() {
        if (father != null) {
            return father.name;
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMother(Dog dog) {
        if (this.mother != null && dog.mother != null) {
            return this.mother.equals(dog.mother);
        } else {
            return false;
        }
    }
}
