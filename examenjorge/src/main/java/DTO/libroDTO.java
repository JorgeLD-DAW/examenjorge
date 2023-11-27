package DTO;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class libroDTO {
	private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal precio;
    private Long autorId;

}
