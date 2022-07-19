package agileGo.agilehrm.hrm.employees;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import agileGo.agilehrm.hrm.departments.Department;

@CrossOrigin(maxAge = 3600)
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees/{deptId}")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee,@PathVariable String deptId)
	{
		
		
		Department dept= new Department();
		 dept.setId(deptId);
		 dept.setName("");
	     employee.setDepartment(dept);
		 employeeService.add(employee);
		 return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id)
	{
		
	   
		return employeeService.getEmployee(id);
		
	}
	
	@DeleteMapping ("/employees/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		   
		
	   
		 employeeService.deleteEmployee(id);
		
	}
	
	@PutMapping ("/employees/{deptId}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable String deptId)
	{
	
		
		
		Department dept= new Department();
		 dept.setId(deptId);
		 dept.setName("");
	     employee.setDepartment(dept);
		 employeeService.add(employee);
		
		
	}
	
	
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(
                        @RequestParam(defaultValue = "0") Integer pageNo, 
                        @RequestParam(defaultValue = "3") Integer pageSize,
                        @RequestParam(defaultValue = "address") String sortBy) 
    {
        List<Employee> list = employeeService.getAllEmployees(pageNo, pageSize, sortBy);
 
        return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK); 
    }


	@GetMapping("/employees/department/{id}")
	public List<Employee> getEmployeesByDepartment(@PathVariable String id)
	{
	   	return employeeService.getEmployeesByDepartment(id);
		
	}
	
}
