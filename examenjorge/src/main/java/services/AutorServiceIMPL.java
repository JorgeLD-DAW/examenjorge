package services;

import java.util.ArrayList;
import java.util.List;
import DTO.AutorDTO;
import persistence.repositories.AutorRepository;
import mappers.AutorMapper;
import DTO.AutorDTO;
import persistence.entities.AutorEntity;
public class AutorServiceIMPL implements AutorService{
	AutorRepository AutorRepository;
	AutorMapper AutorMapper;
	@Override
	public AutorDTO createAutor(AutorDTO autorDTO) {
		AutorEntity AutorN = AutorMapper.autorToEntity(autorDTO);
        AutorEntity GuardarAutor = AutorRepository.save(AutorN);
        return AutorMapper.autorToDTO(GuardarAutor);
	}

	@Override
	public ArrayList<AutorDTO> verAutores() {
		List<AutorEntity> lista = AutorRepository.findAll();
        List<AutorDTO> autores = AutorMapper.listaToDTO(lista);

        return (ArrayList<AutorDTO>) autores;
	}

}
