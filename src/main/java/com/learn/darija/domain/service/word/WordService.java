package com.learn.darija.domain.service.word;

import com.learn.darija.domain.Word;

import java.util.List;
import java.util.UUID;

public interface WordService {

    UUID save(Word word);

    Word findById(UUID uuid);

    List<Word> findAll();

}
