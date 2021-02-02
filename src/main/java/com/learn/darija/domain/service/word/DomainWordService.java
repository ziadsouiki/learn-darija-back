package com.learn.darija.domain.service.word;

import com.learn.darija.domain.Word;
import com.learn.darija.domain.repository.WordRepository;

import java.util.List;
import java.util.UUID;

public class DomainWordService implements WordService {

    private final WordRepository wordRepository;

    public DomainWordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public UUID save(Word word) {
        wordRepository.save(word);
        return word.getId();
    }

    @Override
    public Word findById(UUID uuid) {
        return wordRepository.findById(uuid)
                .orElseThrow(() -> new RuntimeException("Word with given id doesn't exist"));
    }

    @Override
    public List<Word> findAll() {
        return wordRepository.findAll();
    }
}
