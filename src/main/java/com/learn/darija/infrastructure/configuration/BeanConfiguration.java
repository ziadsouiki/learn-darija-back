package com.learn.darija.infrastructure.configuration;

import com.learn.darija.domain.repository.WordRepository;
import com.learn.darija.domain.service.word.DomainWordService;
import com.learn.darija.domain.service.word.WordService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.darija.*")
public class BeanConfiguration {

    @Bean
    WordService wordService(final WordRepository wordRepository) {
        return new DomainWordService(wordRepository);
    }
}
