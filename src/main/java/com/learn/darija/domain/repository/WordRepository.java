package com.learn.darija.domain.repository;

import com.learn.darija.domain.Word;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface WordRepository {
    Optional<Word> findById(UUID id);

    void save(Word word);

    List<Word> findAll();
}
