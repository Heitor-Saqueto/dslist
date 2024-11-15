 package com.osake.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osake.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
 
}
