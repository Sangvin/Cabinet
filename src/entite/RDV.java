package entite;

import java.util.Date;

public class RDV {
	private int id;
	private Date dateHeure;
	private String motif;
	private Medecin medecin;
	private Patient patient;
	
	public RDV(int id, Date dateHeure, String motif, Medecin medecin,
			Patient patient) {
		super();
		this.id = id;
		this.dateHeure = dateHeure;
		this.motif = motif;
		this.medecin = medecin;
		this.patient = patient;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateHeure() {
		return dateHeure;
	}
	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
