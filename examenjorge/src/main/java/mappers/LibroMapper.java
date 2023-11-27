package mappers;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import DTO.libroDTO;
import persistence.entities.LibroEntity;

@Mapper(componentModel = "spring", uses = {AutorMapper.class})
public interface LibroMapper {

	    libroDTO toDto(Object object);
	    LibroEntity toEntity(libroDTO libroDTO);

	    @Mapping(target = "autores", ignore = true)
	    libroDTO toDtoWithoutlibroDTO(LibroEntity libro);
}
