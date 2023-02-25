package com.example.game.entities.character;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Service
public class Character_service {

    private Character_repository character_repo;

    @Autowired
    public Character_service(Character_repository character_repo) {
        this.character_repo = character_repo;
    }

    public Optional<Character> findById(Integer id) {
        return character_repo.findById(id);
    }

    public Iterable<Character> findAll() {
        return character_repo.findAll();
    }

    public Character save(Character videoCassette) {
        return character_repo.save(videoCassette);
    }

    public void deleteById(Integer id) {
        character_repo.deleteById(id);
    }
}
