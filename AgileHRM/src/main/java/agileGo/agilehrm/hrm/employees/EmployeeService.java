package agileGo.agilehrm.hrm.employees;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import agileGo.agilehrm.hrm.departments.Department;
import agileGo.agilehrm.hrm.departments.DepartmentRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void add(Employee employee) {
		// TODO Auto-generated method stub
	//	
		
		
		employeeRepo.save(employee);
		
		
	}
	
	public Optional<Employee> getEmployee(String id) {
		return employeeRepo.findById(id);
	}

	public List<Employee> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
 
        Page<Employee> pagedResult = employeeRepo.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Employee>();
        }
    }



	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
	//List <Employee> emps= new ArrayList<>();
		//employeeRepo.findAll().forEach( emps::add);
		
	
		
		return  employeeRepo.findAll();
	}	

	public List<Employee> getEmployeesByDepartment(String id) {
		// TODO Auto-generated method stub
	//List <Employee> emps= new ArrayList<>();
		//employeeRepo.findAll().forEach( emps::add);
		
	
		
		return  employeeRepo.findAllByDepartmentId(id);
	}

	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

	public void upDate(Employee employee) {
		// TODO Auto-generated method 9emplstub
	//	Department dpt= new Department();
		
	//	dpt.setId(employee.getDepartmentId());
		//employee.setDepartment(dpt);
		employeeRepo.save(employee);
		
	}	
		
			
	}

	


