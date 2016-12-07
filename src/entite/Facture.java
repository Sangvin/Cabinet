package entite;

import java.util.Date;

public class Facture {
	private int id;
	private Patient patient;
	private Medecin medecin;
	private String nomCabinet;
	private int montant;
	private Date date;
	private String motif;
	private boolean paye;
	
	public Facture(int id, Patient patient, Medecin medecin, String nomCabinet,
			int montant, Date date, String motif, boolean paye) {
		super();
		this.id = id;
		this.patient = patient;
		this.medecin = medecin;
		this.nomCabinet = nomCabinet;
		this.montant = montant;
		this.date = date;
		this.motif = motif;
		this.paye = paye;
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

	public String getNomCabinet() {
		return nomCabinet;
	}

	public void setNomCabinet(String nomCabinet) {
		this.nomCabinet = nomCabinet;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public boolean isPaye() {
		return paye;
	}

	public void setPaye(boolean paye) {
		this.paye = paye;
	}
	
	
}
