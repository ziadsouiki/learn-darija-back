package com.learn.darija.application.rest;

import com.learn.darija.application.dto.WordDto;
import com.learn.darija.application.service.WordUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/words")
public class WordController {

    private final WordUseCase wordUseCase;

    @Autowired
    public WordController(WordUseCase wordUseCase) {
        this.wordUseCase = wordUseCase;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<WordDto> findAll() {
        return wordUseCase.findAll();
    }
}