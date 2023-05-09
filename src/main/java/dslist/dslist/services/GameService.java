package dslist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dslist.dslist.dto.GameMinDTO;
import dslist.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll() {
		return repository.findAll().stream().map(GameMinDTO::new).toList();
	}
}