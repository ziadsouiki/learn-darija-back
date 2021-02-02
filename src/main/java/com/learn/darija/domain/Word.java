package com.learn.darija.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class Word {
    private UUID id;
    private String french;
    private String english;
    private String darija;
    private String arabic;
    private WordType type;
}
