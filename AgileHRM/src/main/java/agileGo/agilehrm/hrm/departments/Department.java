package agileGo.agilehrm.hrm.departments;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import agileGo.agilehrm.hrm.employees.Employee;
import agileGo.agilehrm.hrm.organization.Organization;

@Entity
public class Department  {
    

	/**
	 * 
	 */

	@Id
     private String id;
    private String name;
   //@JsonManagedReference
    @JsonBackReference
    @OneToMany ( mappedBy = "department" , fetch = FetchType.LAZY)/*
            cascade = CascadeType.ALL)*/
    private List<Employee> employees;
    

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Organization organization;
    
    
    public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	@JsonBackReference
	@OneToOne
    private Employee manager;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Department parent;
    
    @JsonBackReference
    @OneToMany ( mappedBy = "parent" , fetch = FetchType.LAZY)
    private List<Department> childs;
    
    
    public Department getParent() {
		return parent;
	}
	public void setParent(Department parent) {
		this.parent = parent;
	}
	public List<Department> getChilds() {
		return childs;
	}
	public void setChilds(List<Department> childs) {
		this.childs = childs;
	}
	
    
    public Employee getManager(){return manager;}
    public void setManager(Employee manager){this.manager=manager;}
    public String getId()
    {
        return id;
    }
     public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void setId(String id)
     {
         this.id=id;
     } 

     public String getName()
     {
         return name;
     }
      public void setName(String name)
      {
          this.name=name;
      } 

}
