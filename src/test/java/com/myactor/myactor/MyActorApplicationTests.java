package com.myactor.myactor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MyActorApplicationTests {

    @Autowired
    MyActorApplication myActor;

    /**
     * Basic Tests To Test That The Clues' Functionality Is Working As Expected
     */

    @Test
    public void checkFirstClueIsWorkingTest() {
        String actualApiResponse = myActor.guessMyFavoriteActorClue("1");
        assertEquals("She Starred In The Fast And Furious Franchise",actualApiResponse);
    }

    @Test
    public void checkSecondClueIsWorkingTest() {
        String actualApiResponse = myActor.guessMyFavoriteActorClue("2");
        assertEquals("She Starred In At Least 3 Fast Films",actualApiResponse);
    }
    @Test
    public void checkThirdClueIsWorkingTest() {
        String actualApiResponse = myActor.guessMyFavoriteActorClue("3");
        assertEquals("She Is South African Born",actualApiResponse);
    }
    @Test
    public void intentionallyFailValidationClueTest() {
        String actualApiResponse = myActor.guessMyFavoriteActorClue("3");
        assertEquals("She Starred In The Fast And Furious Franchise",actualApiResponse);
    }

    /**
     * Basic Tests To Test That The Guess' Functionality Is Working As Expected
     */

    @Test
    public void guessTheCorrectActorName(){
        String getResponseForCorrectGuess = myActor.guessMyFavoriteActor("Charlize");
        assertEquals("You Are Correct! ... Lets Go Watch FastX",getResponseForCorrectGuess);
    }

    @Test
    public void guessTheIncorrectActorName(){
        String getResponseForCorrectGuess = myActor.guessMyFavoriteActor("VinDiesel");
        assertEquals("Not Quite .. Getting Warmer Though!",getResponseForCorrectGuess);
    }

    @Test
    public void intentionallyFailValidationGuessTest(){
        String getResponseForCorrectGuess = myActor.guessMyFavoriteActor("VinDiesel");
        assertEquals("You Are Correct! ... Lets Go Watch FastX",getResponseForCorrectGuess);
    }

}
