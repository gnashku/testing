package com.cloud.webapp.service;

import com.cloud.webapp.doa.SecJpaRepo;
import com.cloud.webapp.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SecUserDetailsService  implements UserDetailsService {

    @Autowired
    private SecJpaRepo repo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        users user = repo.findByUsername(s);
        if(user== null) throw  new UsernameNotFoundException("404")  ;

        return new SecUserDetails(user);
     }
}
