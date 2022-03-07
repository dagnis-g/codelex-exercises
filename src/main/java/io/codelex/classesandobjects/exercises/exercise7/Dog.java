package io.codelex.classesandobjects.exercises.exercise7;

import java.util.Objects;

public class Dog {
    private String name;
    private String sex;
    private Dog father;
    private Dog mother;

    public Dog(String name, String sex, Dog mother, Dog father) {
        this.name = name;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
    }

    public Dog(String name, String sex, Dog mother) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
    }

    public Dog(String name, String sex) {
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
        return father.name;
    }

    public boolean hasSameMother(Dog dog) {
        return this.mother.equals(dog.mother);
    }
}
