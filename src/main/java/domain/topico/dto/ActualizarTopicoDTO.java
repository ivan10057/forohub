package domain.topico.dto;

import domain.topico.Estado;

public record ActualizarTopicoDTO(
                                    String titulo,
                                    String mensaje,
                                    Estado estado,
                                    Long cursoId)

{
}
