package agileGo.agilehrm.hrm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingRequestController {
@Autowired 
TrainingRequestRepo repo;

@GetMapping("/traninig/")

public List<TrainingRequest> getAll()
{
	
	return repo.findAll();
}

}
