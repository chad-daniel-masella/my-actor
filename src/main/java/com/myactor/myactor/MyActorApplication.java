package com.myactor.myactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://www.jetbrains.com/help/idea/your-first-spring-application.html
 */
@SpringBootApplication
@RestController
public class MyActorApplication {
    /**
     * Could randomize the `mysecretFavoriteActor` to create more unpredictability??
     */
    public static String mySecretFavoriteActor = "Charlize";
    public static void main(String[] args) {
        SpringApplication.run(MyActorApplication.class, args);
    }

    @GetMapping("/guessMyFavoriteActor")
    public String guessMyFavoriteActor(
            @RequestParam(value = "guessActorName", defaultValue="")
            String actorName){

        String returnString;

        if (mySecretFavoriteActor.equals(actorName)){
            returnString = "You Are Correct! ... Lets Go Watch FastX";
        } else {
            returnString = "Not Quite .. Getting Warmer Though!";
        }

        return returnString;
    }

    @GetMapping("/guessMyFavoriteActor/clue")
    public String guessMyFavoriteActorClue(
            @RequestParam(value = "clueNumber", defaultValue="")
            String clue){

        String clue1 = "She Starred In The Fast And Furious Franchise";
        String clue2 = "She Starred In At Least 3 Fast Films";
        String clue3 = "She Is South African Born";

        switch (clue){
            case "1":
                clue = clue1;
                break;
            case "2":
                clue = clue2;
                break;
            case "3":
                clue = clue3;
                break;
        }

        return clue;
    }

}
