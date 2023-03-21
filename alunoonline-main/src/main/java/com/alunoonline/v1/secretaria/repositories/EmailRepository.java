package com.alunoonline.v1.secretaria.repositories;

import com.alunoonline.v1.secretaria.models.Curso;
import com.alunoonline.v1.secretaria.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
