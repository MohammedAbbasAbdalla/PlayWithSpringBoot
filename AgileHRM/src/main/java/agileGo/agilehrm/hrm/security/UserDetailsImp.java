package agileGo.agilehrm.hrm.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImp implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5909379589756442323L;
	private User user;
	private List<GrantedAuthority> authorities;	
	public UserDetailsImp(User user)
	{
	this.user=user;
	 authorities = new ArrayList<GrantedAuthority>();
     
	 authorities=user.getRoles().stream()
			 .map(r->r.getGrantedAuthority())
			 .collect(Collectors.toList());
	 
	 authorities.forEach(System.out::println);
	 
	/* for (Role role : user.getRoles() )	
    {
    	System.out.println(role.getGrantedAuthority());
    	authorities.add(role.getGrantedAuthority()) ;  	
    }*/
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
	//	List<GrantedAuthority> gAuths = new  ArrayList<GrantedAuthority>() ;
		
    
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		System.out.println(user.getName() +"  : "+ user.getPassword());
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
