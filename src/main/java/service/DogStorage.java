package service;

import model.Dog;

import java.util.ArrayList;

public class DogStorage {
    ArrayList<Dog<String>> shelter = new ArrayList<>();

    public void addToShelter(Dog<String> dog){
        shelter.add(dog);
    }

    public void updateDogDetail(String dogName, int age, String breed){
        //DogCreator dogCreator = new DogCreator();
        for (Dog<String> dog : shelter) {
            if(dogName.equals(dog.getName())){
                dog.setAge(age);
                dog.setBreed(breed);
                break;
            }
            //dogCreator.printDetails(dog);
        }
    }
}
