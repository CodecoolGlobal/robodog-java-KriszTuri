package service;

import model.Dog;

import java.util.concurrent.ThreadLocalRandom;

public class DogCreator {

    private final String[] breeds = new String[]{"Ibizan hound", "Irish Terrier", "American water spaniel", "Australian shepherd"};
    private final String[] names = new String[]{"Abby", "Flash", "Penny", "Hattie", "Riot", "Jax"};

    public Dog<String> createRandomDog(){
        Dog<String> dog = new Dog<>();
        dog.setBreed(breeds[randomNumber(0, breeds.length-1)]);
        dog.setAge(randomNumber(1,14));
        dog.setName(names[randomNumber(0, names.length-1)]);
        return dog;
    }

    public void printDetails(Dog dog){
        System.out.println(dog.getName()+" is a "+dog.getAge()+" yrs old "+dog.getBreed()+".");
    }

    private int randomNumber(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
