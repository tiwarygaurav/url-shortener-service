package com.url.url_shortener_sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.url.url_shortener_sb.models.User;
import com.url.url_shortener_sb.repository.UserRepository;

import jakarta.transaction.Transactional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    // To tell spring sec - this is how you're supposed to laod an user info after validating a token
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not dound with this username: "+ username));
        
        
        return UserDetailsImpl.build(user);

    }

}
