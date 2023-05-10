package dslist.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dslist.dslist.dto.GameDTO;
import dslist.dslist.dto.GameMinDTO;
import dslist.dslist.services.GameService;

@RestController
@RequestMapping(value = "/game")
public class GameController {
	
	@Autowired
	private GameService service;
	
	@GetMapping("/{id}")
	public GameDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return service.findAll();
	}
}