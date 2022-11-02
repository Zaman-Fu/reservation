package skyviewer.service.reservation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


@Entity
public class Reservation {
	
	@Id
	@GeneratedValue
	Long Id;
	@Column
	Long flightId;
	@Column
	String firstname;
	@Column
	String lastname;
	@Column
	String indentification;
	@Column
	String ageCategory;
	@Column
	Boolean luggage;
	@Column
	Float price;
	
	//Constructors
	public Reservation() {}
	public Reservation(Long id, Long flightId, String firstname, String lastname, String indentification,
			String ageCategory, Boolean luggage, Float price) {
		super();
		Id = id;
		this.flightId = flightId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.indentification = indentification;
		this.ageCategory = ageCategory;
		this.luggage = luggage;
		this.price = price;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getIndentification() {
		return indentification;
	}
	public void setIndentification(String indentification) {
		this.indentification = indentification;
	}
	public String getAgeCategory() {
		return ageCategory;
	}
	public void setAgeCategory(String ageCategory) {
		this.ageCategory = ageCategory;
	}
	public Boolean getLuggage() {
		return luggage;
	}
	public void setLuggage(Boolean luggage) {
		this.luggage = luggage;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
	//GetterSetters
	
	
	

}
