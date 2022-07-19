package agileGo.agilehrm.hrm.training;
import agileGo.agilehrm.hrm.training.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import agileGo.agilehrm.hrm.employees.Employee;

@Entity
public class TrainingRequest {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Employee> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Employee> candidates) {
		this.candidates = candidates;
	}

	public Employee getRequester() {
		return requester;
	}

	public void setRequester(Employee requester) {
		this.requester = requester;
	}

	public Integer getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(Integer requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Float getCostEstimation() {
		return costEstimation;
	}

	public void setCostEstimation(Float costEstimation) {
		this.costEstimation = costEstimation;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Calendar getPlanStartingDate() {
		return PlanStartingDate;
	}

	public void setPlanStartingDate(Calendar planStartingDate) {
		PlanStartingDate = planStartingDate;
	}

	public Calendar getPlanEndDate() {
		return PlanEndDate;
	}

	public void setPlanEndDate(Calendar planEndDate) {
		PlanEndDate = planEndDate;
	}

	public Calendar getActualStartingDate() {
		return ActualStartingDate;
	}

	public void setActualStartingDate(Calendar actualStartingDate) {
		ActualStartingDate = actualStartingDate;
	}

	public Calendar getActualEndDate() {
		return ActualEndDate;
	}

	public void setActualEndDate(Calendar actualEndDate) {
		ActualEndDate = actualEndDate;
	}

	@Id
	@GeneratedValue
	(strategy = GenerationType.SEQUENCE,generator = "training_generator")
	@SequenceGenerator
	(name="training_generator", sequenceName = "training_seq", 
	initialValue = 2,
	allocationSize=50)
	private Long id;

	@OneToMany
	private List<Employee> candidates;
	
	@ManyToMany
	private List<Course> courses;
	
	
	
	@OneToOne
	private Employee requester;
	
	
    private Integer  requestStatus ; // Draft= 0 , Complete = 1 , Submit=2 ,  Approved =3 , Reject = 4
    
    private String Description;
    
    private String location;
    
    private Float costEstimation;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date submissionDate;
    
    @Temporal(TemporalType.DATE)
    private Calendar PlanStartingDate;
    
    @Temporal(TemporalType.DATE)
    private Calendar PlanEndDate;
    
    

    @Temporal(TemporalType.DATE)
    private Calendar ActualStartingDate;
    
    @Temporal(TemporalType.DATE)
    private Calendar ActualEndDate;
    
    
    
	
    	
	

}
