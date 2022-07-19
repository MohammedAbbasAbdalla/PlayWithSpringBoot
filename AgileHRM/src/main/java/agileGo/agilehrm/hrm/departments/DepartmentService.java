package agileGo.agilehrm.hrm.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agileGo.agilehrm.hrm.employees.Employee;

@Service
public class DepartmentService {
    @Autowired  
	DepartmentRepo departmentRepo;
    

	public void addDepartment(Department dpt )
	{
         departmentRepo.save(dpt);
        
	}
   
	public void assignManager(Department dpt,String id)
	{
		Employee emp= new Employee();

		emp.setId(id);
       
        dpt.setManager(emp);

		departmentRepo.save(dpt);

	}

	public Department getDepartment(String id)
    {
    	return departmentRepo.getById(id);
    }

	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}

	public List<Department> getChildDepartments(String id) {
		// TODO Auto-generated method stub
	return	departmentRepo.getById(id).getChilds();
		
	} 
}
