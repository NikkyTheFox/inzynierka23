package com.example.game.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Character_repository extends CrudRepository<Character, Long> {
}

