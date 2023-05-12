package dslist.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dslist.dslist.dto.GameListDTO;
import dslist.dslist.dto.GameMinDTO;
import dslist.dslist.dto.ReplacementDTO;
import dslist.dslist.services.GameListService;
import dslist.dslist.services.GameService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
	
	@Autowired
	private GameListService service;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{listId}/game")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		return gameService.findByList(listId);
	}
	
	@PostMapping("/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO replacementDTO) {
		service.move(listId, replacementDTO.getSourceIndex(), replacementDTO.getDestinationIndex());
	}
}