package com.alunoonline.v1.matricula_aluno.dtos;

import com.alunoonline.v1.secretaria.models.Curso;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class HistoricoAlunoDto {

    private String nomeAluno;
    private Set<Curso> cursosAluno;
    private List<DisciplinasAlunoDto> disciplinasAlunoList;
}
