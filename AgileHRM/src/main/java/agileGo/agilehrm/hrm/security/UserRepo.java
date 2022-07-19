package agileGo.agilehrm.hrm.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

public User getByName(String name);	
	
}
