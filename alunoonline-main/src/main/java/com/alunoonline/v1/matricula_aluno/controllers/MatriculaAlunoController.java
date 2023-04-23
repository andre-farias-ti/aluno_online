package com.alunoonline.v1.matricula_aluno.controllers;

import com.alunoonline.v1.matricula_aluno.dtos.HistoricoAlunoDto;
import com.alunoonline.v1.matricula_aluno.models.MatriculaAluno;
import com.alunoonline.v1.matricula_aluno.dtos.MatriculaAlunoNotasOnlyDto;
import com.alunoonline.v1.matricula_aluno.services.MatriculaAlunoService;
import com.alunoonline.v1.secretaria.models.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula-aluno")
public class MatriculaAlunoController {

    @Autowired
    MatriculaAlunoService service;

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<MatriculaAluno> create(@RequestBody MatriculaAluno matriculaAluno) {
        MatriculaAluno matriculaAlunoCreated = service.create(matriculaAluno);

        return ResponseEntity.status(201).body(matriculaAlunoCreated);
    }

    @PatchMapping("/update-notas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void patchGrades(@RequestBody MatriculaAlunoNotasOnlyDto notasOnlyDto, @PathVariable Long id) {
         service.updateNotas(notasOnlyDto, id);
    }

    @PatchMapping("/trancar-matricula/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void patchStatus(@PathVariable Long id) throws Exception {
        service.trancarMatricula(id);
    }

    @GetMapping("/estudante-notas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public HistoricoAlunoDto studentGrades(@PathVariable Long id) {
        return service.getHistoricoFromAluno(id);
    }

    @GetMapping("/estudante/media/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Double retornaMediaAlunos() {

        return service.retonaMediaAluno();
    }

    @GetMapping(value = "/estudante/status/{status}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> retornaAlunosStatus(@PathVariable String status) {

        return service.retonaAlunosStatus(status);
    }

}
