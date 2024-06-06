package com.infosupport.domain;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@Data
@NoArgsConstructor
@Builder @AllArgsConstructor
public class Answer {
    private String text;
    private boolean isCorrect;
}