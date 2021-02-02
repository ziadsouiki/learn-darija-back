package com.learn.darija.application.service;

import com.learn.darija.application.dto.WordDto;
import com.learn.darija.application.mapper.WordMapper;
import com.learn.darija.domain.Word;
import com.learn.darija.domain.service.word.WordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordUseCase {

    private final WordService wordService;
    private final WordMapper wordMapper;

    public WordUseCase(WordService wordService, WordMapper wordMapper) {
        this.wordService = wordService;
        this.wordMapper = wordMapper;
    }

    public List<WordDto> findAll() {
        List<Word> words = wordService.findAll();
        return wordMapper.wordsToWordsDto(words);
    }
}
