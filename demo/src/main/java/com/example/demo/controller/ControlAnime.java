package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import  org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import  com.example.demo.*;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import java.util.List;


@RestController
public class ControlAnime {
    @Autowired
    AnimeDAO animeDAO;
AnimeRepository animeRepository;
@GetMapping("/anime")
    List<Anime>all(){
     return null;
}

@PostMapping("/aa")
public int ss() {
 return 0;
}



}

