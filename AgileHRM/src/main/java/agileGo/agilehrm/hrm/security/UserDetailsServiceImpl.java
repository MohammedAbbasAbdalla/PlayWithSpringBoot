package agileGo.agilehrm.hrm.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
   @Autowired 
	UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(username);
		User user = userRepo.getByName(username);
		System.out.println(username);
//		System.out.println(user.getName());

	    if (user == null) {
	    	System.out.println("NULL");
	       throw new UsernameNotFoundException(username+ "Not Found");
	
	    }
	       //	user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));

	    System.out.println(user.getPassword());
	    
		UserDetailsImp userDetails= new UserDetailsImp(user);
		
		return userDetails;
	}

}
