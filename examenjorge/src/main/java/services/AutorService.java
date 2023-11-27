package services;

import java.util.ArrayList;

import DTO.AutorDTO;

public interface AutorService {
	AutorDTO createAutor(AutorDTO autorDTO);
	 ArrayList <AutorDTO> verAutores();
}
