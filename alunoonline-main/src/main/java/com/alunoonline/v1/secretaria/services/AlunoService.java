package com.alunoonline.v1.secretaria.services;

import com.alunoonline.v1.secretaria.dtos.CadastroAluno;
import com.alunoonline.v1.secretaria.models.Aluno;
import com.alunoonline.v1.secretaria.models.Curso;
import com.alunoonline.v1.secretaria.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public Aluno create(Aluno aluno) {

        //Set<Curso> cursoList = Collections.singleton(new Curso().toBuilder().id(dto.getIdCurso()).build());

        //Aluno aluno = Aluno.builder()
                //.nome(dto.getNomeAluno())
                //.email(dto.getEmailAluno())
                //.cursos(cursoList)
                //.build();

        return repository.save(aluno);
    }

    public Aluno update(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Optional<Aluno> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
