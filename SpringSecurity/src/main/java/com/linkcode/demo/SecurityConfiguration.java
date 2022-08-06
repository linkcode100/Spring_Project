package com.linkcode.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//through this class get the handle of Authentication Manager Builder
@SuppressWarnings("deprecation")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	 
/*	@Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        // Set your configuration on the auth object
	        auth.inMemoryAuthentication()
	                .withUser("blah")  //THIS IS NOT WORKING
	                .password("blah")
	                .roles("USER")
	                .and() //to configure other users
	                .withUser("foo")
	                .password("foo")
	                .roles("ADMIN");
	    }

	
	    @Bean  //to set password encoder ->spring looks for all available beans and if any of them is password encoder it will use it
	    public PasswordEncoder getPasswordEncoder() {
	        return NoOpPasswordEncoder.getInstance(); //but this will return clear text ->for tutorial purpose
	    }
	    
	    
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()  //open up method chaining
	                .antMatchers("/admin").hasRole("ADMIN")  //"admin" url accessible only by those who have role of ADMIN
	                .antMatchers("/user").hasAnyRole("ADMIN", "USER")
	                .antMatchers("/").permitAll()
	                .and().formLogin(); //end the chaining and specify login methods -> here form login
	    }
	    */
	    


}
