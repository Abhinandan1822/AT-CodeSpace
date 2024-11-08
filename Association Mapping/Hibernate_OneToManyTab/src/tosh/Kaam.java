package tosh;

import javax.persistence.*;

@Entity
public class Kaam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Kaam_name")
	private String kaamName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKaamName() {
		return kaamName;
	}

	public void setKaamName(String kaamName) {
		this.kaamName = kaamName;
	}
}
