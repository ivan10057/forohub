package domain.curso.dto;

import domain.curso.Categoria;
import domain.curso.Curso;

public record DetalleCursoDTO(Long id,
                              String name,
                              Categoria categoria,
                              Boolean activo) {

    public DetalleCursoDTO(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }

}