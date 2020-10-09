package qinfenfengfirst;

import java.util.*;
public class Datebase {
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    public void add(Animal animal) {
        animals.add(animal);
    }

    public void remove(int index) {
        animals.remove(index);
    }

    public void getsize() {
        System.out.println(animals.size());
    }

    public ArrayList<Animal> getAnimals(){
        return animals;
    }

    public void set(int i, Animal a) {
        animals.set(i, a);
    }

    public void get(int i) {
        System.out.println(animals.get(i));

    }

    public static void main(String[] args) {

    }
}
