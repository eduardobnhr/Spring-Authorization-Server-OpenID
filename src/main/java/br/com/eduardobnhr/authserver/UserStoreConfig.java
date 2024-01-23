package br.com.eduardobnhr.authserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserStoreConfig {

    @Bean
    UserDetailsService userDetailsService(){

        var UserDetailsManager = new InMemoryUserDetailsManager();

        UserDetailsManager.createUser(
            User.withUsername("user")
            .password("{noop}password")
            .roles("USER")
            .build()
        );

        return UserDetailsManager;

    }
    
}
