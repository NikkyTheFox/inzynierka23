package com.example.game.controller;

import com.example.game.dto.GetCharacterResponse;
import com.example.game.entities.character.Character;
import com.example.game.entities.character.Character_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    private Character_service characterService;

    @Autowired
    public CharacterController(Character_service characterService) {
        this.characterService = characterService;
    }

    @GetMapping("{characterId}")
    public ResponseEntity<GetCharacterResponse> getCharacter(@PathVariable("characterId") Integer characterId) {
        Optional<Character> character = characterService.findById(characterId);
        return character.map(value->ResponseEntity.ok(GetCharacterResponse.entityToDtoMapper().apply(value)))
                .orElseGet(()->ResponseEntity.notFound().build());
    }
}
