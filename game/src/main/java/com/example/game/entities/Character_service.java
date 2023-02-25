package com.example.game.entities;

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

    public Optional<Character> findById(Long id) {
        return character_repo.findById(id);
    }

    public Iterable<Character> findAll() {
        return character_repo.findAll();
    }

    public Character save(Character videoCassette) {
        return character_repo.save(videoCassette);
    }

    public void deleteById(Long id) {
        character_repo.deleteById(id);
    }
}
