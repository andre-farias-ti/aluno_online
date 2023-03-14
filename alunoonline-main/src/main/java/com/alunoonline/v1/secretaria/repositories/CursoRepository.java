package com.alunoonline.v1.secretaria.repositories;

import com.alunoonline.v1.secretaria.models.Aluno;
import com.alunoonline.v1.secretaria.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query(value = "select a from Curso c inner join Aluno a on c.id = a.id " +
            "where c.id =:id")
    List<Aluno> consultarListaAlunoJpql(@Param("id")Long id);


}
