package com.example.Webhook;

/*
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
*/

//@EnableWebSecurity
//@Configuration
public class AppSecurity {}/*extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .requiresChannel().anyRequest().requiresSecure()
                .and()
                .authorizeRequests()
                .antMatchers("/login", "/error","/webhookTest","/Check1","/Check2")
                .permitAll()
                ;
    }
}*/