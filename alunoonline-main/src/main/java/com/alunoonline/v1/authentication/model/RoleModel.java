package com.alunoonline.v1.authentication.model;

import com.alunoonline.v1.enuns.RoleName;
import org.springframework.security.core.GrantedAuthority;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="role_model")
public class RoleModel implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ROLEId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName roleName;

    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }

    public Long getROLEId() {
        return ROLEId;
    }

    public void setROLEId(Long ROLEId) {
        this.ROLEId = ROLEId;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
}
