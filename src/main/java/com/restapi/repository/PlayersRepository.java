package com.restapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restapi.models.Player;

public interface PlayersRepository extends JpaRepository<Player, String> {

	@Query(value="select * from player where name=:playername",nativeQuery = true)
	Optional<Player> findByNameq(String playername);

}
