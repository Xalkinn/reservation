package vol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import vol.TypeAvion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import reservation.Reservation;

@Entity
@Table(name = "vol")
public class Vol{
	
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String numeroVol;
	
	//Type d'avion => enumération
	@Column
	private TypeAvion typeAvion;
	
	@Column
	private Integer nombrePlace;
	
	@Column
	private String villeDepard;
	
	@Column
	private String villeArrive;
	
	@Column
	private LocalDate date;
	
	/*@ManyToMany
	private List <Reservation> listereservation = new ArrayList <Reservation>();*/
	
	

	public Vol(String numeroVol, TypeAvion typeAvion, int nombrePlace, String villeDepard, String villeArrive,
			LocalDate date) {
		this.numeroVol = numeroVol;
		this.typeAvion = typeAvion;
		this.nombrePlace = nombrePlace;
		this.villeDepard = villeDepard;
		this.villeArrive = villeArrive;
		this.date = date;
	}

	public String getNumeroVol() {
		return numeroVol;
	}

	public void setNumeroVol(String numeroVol) {
		this.numeroVol = numeroVol;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	public String getVilleDepard() {
		return villeDepard;
	}

	public void setVilleDepard(String villeDepard) {
		this.villeDepard = villeDepard;
	}
	
	public TypeAvion getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(TypeAvion typeAvion) {
		this.typeAvion = typeAvion;
	}

	public String getVilleArrive() {
		return villeArrive;
	}

	public void setVilleArrive(String villeArrive) {
		this.villeArrive = villeArrive;
	}

	public Long getId() {
		return id;
	}
}
