package com.CarRental.CarRental.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import javax.sql.DataSource;


@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
/*
        http.authorizeRequests()
            .antMatchers("/", "/register","/userAdded").permitAll()
            .antMatchers("/loggeduser").hasAuthority("USER").anyRequest().authenticated()
            .antMatchers("/loggeddealer").hasAuthority("ADMIN").anyRequest().authenticated()
            .and().formLogin()
            .and()
            .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/");
*/
        http.authorizeRequests()
                .antMatchers("/", "/register","/userAdded").permitAll()
                .antMatchers("/redirect").authenticated()
                .and().formLogin()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/");


    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select email, password, active from user where email=?")
                .authoritiesByUsernameQuery("select u.email, r.name from user u inner join user_role ur on(u.id=ur.user_id) inner join role r on(ur.role_id=r.id) where u.email=?")
                .passwordEncoder(bCryptPasswordEncoder);
    }
/*
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username, password, active from user where username=?")
                .authoritiesByUsernameQuery("select u.username, r.name from user u inner join user_role ur on(u.id=ur.user_id) inner join role r on(ur.role_id=r.id) where u.username=?")
                .passwordEncoder(bCryptPasswordEncoder);
    }
    */
}
