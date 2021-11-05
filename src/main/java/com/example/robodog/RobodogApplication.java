package com.example.robodog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.DogCreator;
import service.DogStorage;

@SpringBootApplication
public class RobodogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobodogApplication.class, args);

		/*DogCreator dogCreator = new DogCreator();
		DogStorage dogStorage = new DogStorage();

		for(int i=0; i<6; i++){
			dogStorage.addToShelter(dogCreator.createRandomDog());
		}
		dogStorage.updateDogDetail("Hattie", 1, "cukikutyus");*/
	}

}
