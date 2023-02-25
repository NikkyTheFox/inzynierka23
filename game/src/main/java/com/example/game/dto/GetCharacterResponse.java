package com.example.game.dto;



import com.example.game.entities.character.Character;
import lombok.*;

import java.util.function.Function;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
public class GetCharacterResponse {
    private Integer id;
    private String name;
    public static Function<Character, GetCharacterResponse> entityToDtoMapper(){
        return characters -> GetCharacterResponse.builder()
                .id(characters.getId())
                .name(characters.getName())
                .build();
    }


}
