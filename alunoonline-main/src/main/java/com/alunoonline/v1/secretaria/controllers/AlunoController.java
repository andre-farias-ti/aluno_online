package com.alunoonline.v1.secretaria.controllers;

import com.alunoonline.v1.secretaria.models.Aluno;
import com.alunoonline.v1.secretaria.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService service;

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {
        Aluno alunoCreated = service.create(aluno);

        return ResponseEntity.status(201).body(alunoCreated);
    }

    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Aluno> update(@RequestBody Aluno aluno) {
        Aluno alunoCreated = service.create(aluno);

        return ResponseEntity.status(201).body(alunoCreated);
    }

    @GetMapping("/listar-todos")
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    //@PreAuthorize("hasAnyRole('ROLE_USER')")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Aluno> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
