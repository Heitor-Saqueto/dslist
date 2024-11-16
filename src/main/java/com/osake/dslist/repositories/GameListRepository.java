 package com.osake.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osake.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
 
}
