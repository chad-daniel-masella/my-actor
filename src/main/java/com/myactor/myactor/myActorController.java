package com.myactor.myactor;

import com.myactor.myactor.MyActorApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getMyActor")
public class myActorController {
    @Autowired
    private MyActorApplication MyActor;

//    @GetMapping("/{actorName}")
//    public getMyActorClue read(@PathVariable String actorName){
//        return MyActor.guessMyFavoriteActorClue(actorName);
//    }
}
