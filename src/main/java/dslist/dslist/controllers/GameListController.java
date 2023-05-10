package dslist.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dslist.dslist.dto.GameListDTO;
import dslist.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
	
	@Autowired
	private GameListService service;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return service.findAll();
	}
}