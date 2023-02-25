package com.example.game.entities.character;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@Entity
@Table(name="characters")
public class Character {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;

}
