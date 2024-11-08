package biit;

import javax.persistence.*;

@Entity
public class Person {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private String name;
	 private String company;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "pass_id")
	 private Passport pass;

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

	public Passport getPass() {
		return pass;
	}

	public void setPass(Passport pass) {
		this.pass = pass;
	}
}
