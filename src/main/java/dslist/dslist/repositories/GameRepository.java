package dslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dslist.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}