package domain.curso.dto;

import domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo
     )
{
}
