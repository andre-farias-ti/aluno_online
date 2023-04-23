package com.alunoonline.v1.authentication;

import com.alunoonline.v1.enuns.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleModelRepository extends JpaRepository<RoleModel, Long> {

    public List<RoleModel> findByRoleNameIn(List<RoleName> roles);

}
