package agileGo.agilehrm.hrm.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceEndPointUrlRepo extends JpaRepository<ServiceEndPointUrlEntity, Integer> {

	public ServiceEndPointUrlEntity getByName(String name);
	
}
