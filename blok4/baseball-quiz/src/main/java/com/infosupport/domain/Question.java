package com.infosupport.domain;

import com.infosupport.util.AnswerSerializer;
import jakarta.json.bind.annotation.JsonbTypeSerializer;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@XmlRootElement
@Getter @Setter @ToString @EqualsAndHashCode(callSuper = true)
@Entity
public class Question extends JPAEntity {

    private String text;
    private Integer strikes;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonbTypeSerializer(AnswerSerializer.class) // to be able to correctly serialize the set to json
    public Set<Answer> answers;
}
