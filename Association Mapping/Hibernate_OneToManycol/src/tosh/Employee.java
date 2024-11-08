package tosh;

import java.util.List;
import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String company;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_tasks")
	private List<Tasks> tasks;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<Tasks> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;
	}
}
