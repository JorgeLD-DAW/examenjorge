package services;
import persistence.repositories.LibroRepository;
import mappers.LibroMapper;
import DTO.libroDTO;
public class LibroServiceIMPL implements LibroService{
	LibroMapper LibroMapper;
	LibroRepository librorepository;
	@Override
	public libroDTO crearLibro(libroDTO LibroDTO) {
		
	  return LibroMapper.toDto(LibroRepository.save(LibroMapper.toEntity(LibroDTO)));
	}
	
}
