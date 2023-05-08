package com.alunoonline.v1.authentication.repository;

import com.alunoonline.v1.authentication.model.UrlPermissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlPermissaoRepository extends JpaRepository<UrlPermissao, Long> {
}
