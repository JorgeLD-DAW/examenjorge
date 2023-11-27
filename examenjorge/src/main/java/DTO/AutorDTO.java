package DTO;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {
	private Long id;
    private String nombre;
    private String nacionalidad;
    private List<libroDTO> libros = new ArrayList<>();
}
