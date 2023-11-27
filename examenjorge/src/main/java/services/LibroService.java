package services;
import persistence.repositories.LibroRepository;
import DTO.libroDTO;
public interface LibroService {
	public LibroRepository LibroRepository = new LibroRepository();
	public libroDTO crearLibro(libroDTO LibroDTO);
}
