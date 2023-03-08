package com.alunoonline.v1.secretaria.services;

import com.alunoonline.v1.secretaria.models.Curso;
import com.alunoonline.v1.secretaria.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    CursoRepository repository;

    public Curso create(Curso curso) {
        return repository.save(curso);
    }

    public List<Curso> findAll() {
        return repository.findAll();
    }

    public Optional<Curso> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
