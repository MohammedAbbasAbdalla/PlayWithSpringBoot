package agileGo.agilehrm.hrm.employees;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonBackReference;

import agileGo.agilehrm.hrm.departments.Department;
import agileGo.agilehrm.hrm.organization.Organization;

@Entity
public class Employee {
/**
	 * 
	 */
	private static final long serialVersionUID = -894236193350000043L;
@Id 
private String id;
public Employee(String id, String title, Department dept, String firstName, String secondName, String thirdName,
		String lastName, String birthDate, String joinDate, String grade, String mobile, String address) {
	super();
	this.id = id;
	this.title = title;
	this.department = dept;
	this.firstName = firstName;
	this.secondName = secondName;
	this.thirdName = thirdName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.joinDate = joinDate;
	this.grade = grade;
	this.mobile = mobile;
	this.address = address;
}


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


private String title;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSecondName() {
	return secondName;
}
public void setSecondName(String secondName) {
	this.secondName = secondName;
}
public String getThirdName() {
	return thirdName;
}
public void setThirdName(String thirdName) {
	this.thirdName = thirdName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getBirthDate() {
	return birthDate;
}
public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
public String getJoinDate() {
	return joinDate;
}
public void setJoinDate(String joinDate) {
	this.joinDate = joinDate;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Department getDepartment() {
	return department;
}

public String getDepartmentName()
{
	return department.getName();
}


public void setDepartment(Department department) {
	this.department = department;
}



@JsonBackReference
@ManyToOne(fetch = FetchType.LAZY)
private Department department;

@JsonBackReference
@ManyToOne(fetch = FetchType.LAZY)
private Organization organization;


@ManyToOne(fetch = FetchType.LAZY)
private Employee reportTo;



public Employee getReportTo() {
	return reportTo;
}


public void setReportTo(Employee reportTo) {
	this.reportTo = reportTo;
}


public List<Employee> getEmployeesUnderSupervision() {
	return EmployeesUnderSupervision;
}


public void setEmployeesUnderSupervision(List<Employee> employeesUnderSupervision) {
	EmployeesUnderSupervision = employeesUnderSupervision;
}


@JsonBackReference
@OneToMany ( mappedBy = "reportTo" , fetch = FetchType.LAZY)
private List<Employee> EmployeesUnderSupervision;


@OneToMany ( mappedBy = "employee" , fetch = FetchType.LAZY)
private List<TrainingHistory> trainingHistory;




public List<TrainingHistory> getTrainingHistory() {
	return trainingHistory;
}


public void setTrainingHistory(List<TrainingHistory> trainingHistory) {
	this.trainingHistory = trainingHistory;
}


public Organization getOrganization() {
	return organization;
}





public void setOrganization(Organization organization) {
	this.organization = organization;
}


private String firstName;
private String secondName;
private String thirdName;
private String lastName;
private String birthDate;
private String joinDate;
private String grade;
private String mobile;
private String address;



}
