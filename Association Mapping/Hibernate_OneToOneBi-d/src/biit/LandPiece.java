package biit;

import javax.persistence.*;

@Entity
public class LandPiece {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pieceId;
	
	private String district;
	
	@OneToOne(mappedBy = "landpiece", cascade = CascadeType.ALL)
	private King king;

	public int getPieceId() {
		return pieceId;
	}

	public void setPieceId(int pieceId) {
		this.pieceId = pieceId;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}
}
