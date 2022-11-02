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
	
	

}
