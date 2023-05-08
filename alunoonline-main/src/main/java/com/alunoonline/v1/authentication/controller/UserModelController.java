package com.alunoonline.v1.authentication.controller;

import com.alunoonline.v1.authentication.model.UserModel;
import com.alunoonline.v1.authentication.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserModelController {

    @Autowired
    UserDetailsServiceImpl service;

    @RequestMapping(value="/criar-usuario", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<UserModel>  criarUsuario (@RequestBody UserModel user) {

        return ResponseEntity.status(201).body(service.criarUsuario(user));
    }
}