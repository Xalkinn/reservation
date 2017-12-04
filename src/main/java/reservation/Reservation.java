package reservation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import vol.Vol;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String nom;

	@Column
	String prenom;

	@Column
	int age;
	
	/*@ManyToMany (mappedBy = "listeReservation")
	private List <Vol> listeVol = new ArrayList<Vol>();
*/
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}
}
