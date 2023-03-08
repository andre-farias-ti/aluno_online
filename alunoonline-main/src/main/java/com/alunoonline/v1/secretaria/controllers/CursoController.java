package com.alunoonline.v1.secretaria.controllers;

import com.alunoonline.v1.secretaria.models.Aluno;
import com.alunoonline.v1.secretaria.models.Curso;
import com.alunoonline.v1.secretaria.services.AlunoService;
import com.alunoonline.v1.secretaria.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Curso> create(@RequestBody Curso curso) {
        Curso cursoCreated = service.create(curso);

        return ResponseEntity.status(201).body(cursoCreated);
    }

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Curso> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
