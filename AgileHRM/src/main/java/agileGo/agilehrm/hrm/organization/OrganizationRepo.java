package agileGo.agilehrm.hrm.organization;

import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepo extends CrudRepository<Organization, String> {

	//public Organization findByCeoId(String id);
	
}
