package dslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dslist.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}