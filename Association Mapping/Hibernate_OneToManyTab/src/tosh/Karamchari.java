package tosh;

import javax.persistence.*;
import java.util.List;

@Entity
public class Karamchari {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String company;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "emp_tasks",
	 		joinColumns = @JoinColumn(name = "emp_id"),
	 		inverseJoinColumns = @JoinColumn(name = "task_id"))
	
	private List<Kaam> tasks;

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

	public List<Kaam> getTasks() {
		return tasks;
	}

	public void setTasks(List<Kaam> tasks) {
		this.tasks = tasks;
	}
	
}