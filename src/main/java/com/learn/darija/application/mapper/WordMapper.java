package com.learn.darija.application.mapper;

import com.learn.darija.application.dto.WordDto;
import com.learn.darija.domain.Word;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WordMapper {

    public List<WordDto> wordsToWordsDto(List<Word> words) {
        return words.stream()
                .map(word -> wordToWordDto(word))
                .collect(Collectors.toList());
    }

    public WordDto wordToWordDto(Word word) {
        if (word != null) {
            return WordDto
                    .builder()
                    .id(word.getId())
                    .arabic(word.getArabic())
                    .english(word.getEnglish())
                    .darija(word.getDarija())
                    .french(word.getFrench())
                    .type(word.getType() != null ? word.getType().toString() : null)
                    .build();
        }
        return null;
    }
}
