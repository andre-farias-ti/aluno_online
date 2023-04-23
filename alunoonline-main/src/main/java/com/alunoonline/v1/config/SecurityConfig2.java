package com.alunoonline.v1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig2 {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and().authorizeHttpRequests()
//                .antMatchers(HttpMethod.GET, "/alunos/**").permitAll()
//                .antMatchers(HttpMethod.POST, "/alunos").hasRole("USER")
//                .antMatchers(HttpMethod.DELETE, "/alunos/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .logout(logout -> logout
                        .logoutUrl("/basic/basiclogout")
                        .addLogoutHandler(new SecurityContextLogoutHandler())
                )
                .csrf().disable();

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
