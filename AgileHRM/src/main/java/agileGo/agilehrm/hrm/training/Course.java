package agileGo.agilehrm.hrm.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {

	@Id
	@GeneratedValue
	(strategy = GenerationType.SEQUENCE,generator = "course_generator")
	@SequenceGenerator
	(name="course_generator", sequenceName = "course_seq", 
	initialValue = 2,
	allocationSize=50)
	private long id;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public long getId() {
		return id;
	}
	private String title;
	private String Description;
	
}
