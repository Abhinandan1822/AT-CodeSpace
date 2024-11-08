package sky;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Address {
	
	@Column(name = "Address")
	private String house;
	private String city;
	private String state;
	
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
