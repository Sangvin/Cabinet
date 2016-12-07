package entite;

import java.util.Date;

public class Paiement {
	private int id;
	private Patient patient;
	private Facture facture;
	private Date date;
	private int montant;
	private Medecin medecin;
	
	public Paiement(int id, Patient patient, Facture facture, Date date,
			int montant, Medecin medecin) {
		super();
		this.id = id;
		this.patient = patient;
		this.facture = facture;
		this.date = date;
		this.montant = montant;
		this.medecin = medecin;
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
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
}
