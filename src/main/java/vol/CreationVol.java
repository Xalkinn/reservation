package vol;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vol")
public class CreationVol {
	
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private Float numeroVol;

	@Column
	private String typeAvion;
	
	@Column
	private int nombrePlace;
	
	@Column
	private String villeDepard;
	
	@Column
	private String villeArrive;
	
	@Column
	private LocalDate date;

	public Float getNumeroVol() {
		return numeroVol;
	}

	public void setNumeroVol(Float numeroVol) {
		this.numeroVol = numeroVol;
	}

	public String getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(String typeAvion) {
		this.typeAvion = typeAvion;
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
