package agileGo.agilehrm.hrm.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsServiceImpl userDS;
    @Autowired 
    ServiceEndPointUrl endPoint;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
			
		auth.userDetailsService(userDS);
		
	
	}

	
	@Override
	protected void configure(HttpSecurity https) throws Exception
	{
		
		System.out.println(endPoint.getByName("Department").getPath()+"**");
		
		https.authorizeRequests()
	      .antMatchers(endPoint.getByName("Department").getPath()+"**").access("hasRole('HR')")
	      .and()
	      // some more method calls
	      .formLogin();
	}
	
/*	@Bean
	public PasswordEncoder  getEncoder()
	{
		return new  MessageDigestPasswordEncoder("MD5");
	}*/
	
	@Bean
	public PasswordEncoder getEncoder()
	{
	//	return new Pbkdf2PasswordEncoder();
return NoOpPasswordEncoder.getInstance();
	}
	
}
