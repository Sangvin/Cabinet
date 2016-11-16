package entité;

import java.util.Date;

public class Certificat {
	private int id;
	private Patient patient;
	private Medecin medecin;
	private String motif;
	private Date date;
	private String description;
	private String nomCabinet;
	
	public Certificat(int id, Patient patient, Medecin medecin, String motif,
			Date date, String description, String nomCabinet) {
		super();
		this.id = id;
		this.patient = patient;
		this.medecin = medecin;
		this.motif = motif;
		this.date = date;
		this.description = description;
		this.nomCabinet = nomCabinet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNomCabinet() {
		return nomCabinet;
	}

	public void setNomCabinet(String nomCabinet) {
		this.nomCabinet = nomCabinet;
	}
	
	
}
