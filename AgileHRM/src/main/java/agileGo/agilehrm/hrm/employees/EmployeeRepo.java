package agileGo.agilehrm.hrm.employees;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends  JpaRepository<Employee,String>{

	public List<Employee> findAllByDepartmentId(String id);
	
}