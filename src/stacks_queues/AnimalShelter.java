package stacks_queues;

import java.util.Arrays;
import java.util.LinkedList;

public class AnimalShelter {

    public enum Animal {
        Cat, Dog
    }

    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        LinkedList<Animal> animals = new LinkedList<>();
        shelter.enqueue(Animal.Cat, animals);
        shelter.enqueue(Animal.Dog, animals);
        shelter.enqueue(Animal.Cat, animals);
        shelter.enqueue(Animal.Cat, animals);
        shelter.enqueue(Animal.Dog, animals);
        shelter.enqueue(Animal.Cat, animals);
        shelter.enqueue(Animal.Dog, animals);

        System.out.println(Arrays.toString(animals.toArray()));
        shelter.dequeueAny(animals);
        System.out.println(Arrays.toString(animals.toArray()));
        shelter.dequeueCat(animals);
        System.out.println(Arrays.toString(animals.toArray()));
        shelter.dequeueAny(animals);
        shelter.dequeueDog(animals);
        System.out.println(Arrays.toString(animals.toArray()));

    }

    private void enqueue(Animal animal, LinkedList<Animal> list) {
        if (animal == null || list == null) return;
        list.add(animal);
    }

    private Animal dequeueAny(LinkedList<Animal> list) {
        if (list == null) return null;
        return list.pollFirst();
    }

    private Animal dequeueDog(LinkedList<Animal> list) {
        if (list == null) return null;
        Animal a;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Animal.Dog) {
                a = list.get(i);
                list.remove(i);
                return a;
            }
        }
        return null;
    }

    private  Animal dequeueCat(LinkedList<Animal> list) {
        if (list == null) return null;
        Animal a;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Animal.Cat) {
                a = list.get(i);
                list.remove(i);
                return a;
            }
        }
        return null;
    }

}
