package sky;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Embedded;



// ENTITY AND ID is a mandatory field in hiberante operations
@Entity
@Table(name ="Emp")
public class Employee {
	
	@Id
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@Embedded // for conventional purpose
	private Address house;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHouse() {
		return house;
	}

	public void setHouse(Address house) {
		this.house = house;
	}
	
	
}
