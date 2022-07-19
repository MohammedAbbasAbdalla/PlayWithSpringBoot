package agileGo.agilehrm.hrm.employees;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import agileGo.agilehrm.hrm.training.Course;



@Entity
public class TrainingHistory {
	
	@Id
	Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Calendar getCompilationDate() {
		return compilationDate;
	}
	public void setCompilationDate(Calendar compilationDate) {
		this.compilationDate = compilationDate;
	}
	
	@JsonBackReference
	@ManyToOne
	Employee employee;
	
	@OneToOne
	 Course course;
	 Calendar compilationDate;
	 
	
	
	
	

}
