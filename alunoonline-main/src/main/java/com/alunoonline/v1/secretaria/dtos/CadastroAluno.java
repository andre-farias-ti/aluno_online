package com.alunoonline.v1.secretaria.dtos;

import lombok.Data;

@Data
public class CadastroAluno {

    private String nomeAluno;
    private String emailAluno;
    private Long idCurso;

}
