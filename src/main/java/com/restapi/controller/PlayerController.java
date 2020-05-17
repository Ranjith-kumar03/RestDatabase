package com.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.models.Player;
import com.restapi.repository.PlayersRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerController {
	
	@Autowired
	public PlayersRepository _repo;
	
	@GetMapping("/players")
	public List<Player> getAllPlayers()
	{
		return _repo.findAll();
	}
	@PostMapping("/player")
	public Player addPlayer(@RequestBody Player player)
	{
		_repo.save(player);
	Optional<Player> player_ret=	_repo.findById(player.getName());
	return player_ret.get();
	}
	@PostMapping("/addplayers")
	public List<Player> addPlayers(@RequestBody List<Player> players)
	{
		_repo.saveAll(players);
	
	return _repo.findAll();
	}
	@GetMapping("/player/{name}")
	public Player getPlayer(@PathVariable("name") String name)
	{
		Optional<Player> player_ret=	_repo.findByNameq(name);
		return player_ret.get();
	}
}
