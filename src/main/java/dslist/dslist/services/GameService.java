package dslist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dslist.dslist.dto.GameDTO;
import dslist.dslist.dto.GameMinDTO;
import dslist.dslist.entities.Game;
import dslist.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game game = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Game not found"));
		
		return new GameDTO(game);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		return repository.findAll().stream().map(GameMinDTO::new).toList();
	}
}