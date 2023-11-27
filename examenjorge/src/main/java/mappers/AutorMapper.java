package mappers;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import DTO.AutorDTO;
import persistence.entities.AutorEntity;
@Mapper(componentModel = "spring")
public interface AutorMapper {
	
	    AutorDTO autorToDTO (AutorEntity autor);
	    AutorEntity autorToEntity (AutorDTO autor);
	    @Mapping(target = "libros", ignore = true)
	    AutorDTO toDtoWithoutlibros(AutorEntity autor);
		List<AutorDTO> listaToDTO(List<AutorEntity> lista);
}
