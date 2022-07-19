package agileGo.agilehrm.hrm.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEndPointUrl {

	@Autowired 
	ServiceEndPointUrlRepo endPointRepo;
	
	public List<ServiceEndPointUrlEntity> getAllEndPoint()
	{
		return endPointRepo.findAll();
	}
	
	public ServiceEndPointUrlEntity getByName(String name)
	{
		return endPointRepo.getByName(name);
	}
}
