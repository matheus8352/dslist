package dslist.dslist.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import dslist.dslist.entities.GameList;

public class GameListDTO implements Serializable{

	private static final long serialVersionUID = -7465240706093373631L;

	private Long id;
	
	private String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}