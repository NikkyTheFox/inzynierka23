package com.example.game.entities.character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Character_repository extends JpaRepository<Character, Integer> {

}

