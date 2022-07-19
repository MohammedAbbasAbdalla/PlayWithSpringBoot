package agileGo.agilehrm.hrm.security;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class ServiceEndPointUrlEntity {

@Id
	private Integer id;
    public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
	private String name;
    private String path;
    
}
