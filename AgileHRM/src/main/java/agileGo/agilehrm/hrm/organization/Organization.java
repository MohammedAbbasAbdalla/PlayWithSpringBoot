package agileGo.agilehrm.hrm.organization;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import agileGo.agilehrm.hrm.departments.Department;
import agileGo.agilehrm.hrm.employees.Employee;

@Entity
public class Organization {

	
	
	@Id
	private String id;
	private String name;
	@JsonBackReference
	@OneToOne
    private  Employee ceo;
	private String address;
	private String fax;
	private String website;
	private String email;
	
	@JsonBackReference
    @OneToMany ( mappedBy = "organization" , fetch = FetchType.LAZY)
    private List<Department> departments;
	
	    @JsonBackReference
	    @OneToMany ( mappedBy = "organization" , fetch = FetchType.LAZY)/*
	            cascade = CascadeType.ALL)*/
	     private List<Employee> employees;
	

	public List<Employee> getEmployees() {
			return employees;
		}



		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}



	public Organization() {
		super();
		
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Employee getCeo() {
		return ceo;
	}



	public void setCeo(Employee ceo) {
		this.ceo = ceo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getFax() {
		return fax;
	}



	public void setFax(String fax) {
		this.fax = fax;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public List<Department> getDepartments() {
		return departments;
	}



	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	
	
}
