package com.learn.darija.application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Builder
@Getter
@Setter
@ToString
public class WordDto {
    private UUID id;
    private String french;
    private String english;
    private String darija;
    private String arabic;
    private String type;
}
