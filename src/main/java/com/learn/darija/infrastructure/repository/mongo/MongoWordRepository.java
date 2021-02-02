package com.learn.darija.infrastructure.repository.mongo;

import com.learn.darija.domain.Word;
import com.learn.darija.domain.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class MongoWordRepository implements WordRepository {

    private final SpringDataMongoWordRepository wordRepository;

    @Autowired
    public MongoWordRepository(SpringDataMongoWordRepository springDataMongoWordRepository) {
        this.wordRepository = springDataMongoWordRepository;
    }

    @Override
    public Optional<Word> findById(UUID id) {
        return wordRepository.findById(id);
    }

    @Override
    public void save(Word word) {
        wordRepository.save(word);
    }

    @Override
    public List<Word> findAll() {
        return wordRepository.findAll();
    }
}
