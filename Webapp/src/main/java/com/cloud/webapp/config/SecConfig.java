package com.cloud.webapp.config;

import com.cloud.webapp.service.SecUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecUserDetailsService service;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//        UserDetails user = User.withUsername("jake").password("password").roles("Admin").build();
//        auth.inMemoryAuthentication().withUser(user);

        auth.userDetailsService(service).passwordEncoder(encoder());

     }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()
         .antMatchers("/api/v0/**").hasAnyRole("Admin").anyRequest().authenticated()
                .and().formLogin();

    }


    @Bean
    public PasswordEncoder encoder(){

        return NoOpPasswordEncoder.getInstance();
    }
}
