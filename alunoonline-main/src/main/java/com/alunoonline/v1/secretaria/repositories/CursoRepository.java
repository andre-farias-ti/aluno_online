package com.alunoonline.v1.secretaria.repositories;

import com.alunoonline.v1.secretaria.models.Aluno;
import com.alunoonline.v1.secretaria.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
