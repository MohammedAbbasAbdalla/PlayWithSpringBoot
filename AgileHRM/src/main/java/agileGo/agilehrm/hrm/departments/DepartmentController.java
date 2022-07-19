package agileGo.agilehrm.hrm.departments;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import agileGo.agilehrm.hrm.employees.Employee;

@RestController
public class DepartmentController {
   

    @Autowired
    DepartmentService departmentService;
    
    @GetMapping("/departments/")
    public List<Department> getDepartments()
    {
        return departmentService.getDepartments();
        
    }
    
    @PutMapping("/departments/manager/{eid}")

    public void setManager(@RequestBody Department dpt,@PathVariable String eid)
    {
         departmentService.assignManager(dpt, eid);

    }
    
    @GetMapping("/departments/{id}/employees/")
    public List<Employee> getDepartmentEmployess(@PathVariable  String id )
    {
        
    	//List <Employee> emps= new ArrayList<>();
    	return departmentService.getDepartment(id).getEmployees();
      

    }
    
    @GetMapping("/departments/{id}/departments/")
    public List<Department> getDepartmentChilds(@PathVariable  String id )
    {
        
    	//List <Employee> emps= new ArrayList<>();
    	return departmentService.getChildDepartments(id);
      

    }
    
}