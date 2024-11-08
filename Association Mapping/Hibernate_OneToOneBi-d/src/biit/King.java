package biit;

import javax.persistence.*;

@Entity
@Table(name = "Badshah")
public class King {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int LandNumber;
	private String LandName;
	private String LandOwner;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private LandPiece landpiece;

	public int getLandNumber() {
		return LandNumber;
	}

	public void setLandNumber(int landNumber) {
		LandNumber = landNumber;
	}

	public String getLandName() {
		return LandName;
	}

	public void setLandName(String landName) {
		LandName = landName;
	}

	public String getLandOwner() {
		return LandOwner;
	}

	public void setLandOwner(String landOwner) {
		LandOwner = landOwner;
	}

	public LandPiece getLandpiece() {
		return landpiece;
	}

	public void setLandpiece(LandPiece landpiece) {
		this.landpiece = landpiece;
	}

}
