package com.learn.darija.infrastructure.repository.mongo;

import com.learn.darija.domain.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoWordRepository extends MongoRepository<Word, UUID>
{
}
