package entité;

import java.util.ArrayList;
import java.util.Date;

public class DossierMedical {
	private int id;
	private Patient patient;
	private ArrayList<Ordonnance> listeOrdonnance;
	private ArrayList<String> vaccin;
	private Date derniereVisite;
	private String traitementEnCours;
	private Medecin medecin;
	
	public DossierMedical(int id, Patient patient,
			ArrayList<Ordonnance> listeOrdonnance, ArrayList<String> vaccin,
			Date derniereVisite, String traitementEnCours, Medecin medecin) {
		super();
		this.id = id;
		this.patient = patient;
		this.listeOrdonnance = listeOrdonnance;
		this.vaccin = vaccin;
		this.derniereVisite = derniereVisite;
		this.traitementEnCours = traitementEnCours;
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

	public ArrayList<Ordonnance> getListeOrdonnance() {
		return listeOrdonnance;
	}

	public void setListeOrdonnance(ArrayList<Ordonnance> listeOrdonnance) {
		this.listeOrdonnance = listeOrdonnance;
	}

	public ArrayList<String> getVaccin() {
		return vaccin;
	}

	public void setVaccin(ArrayList<String> vaccin) {
		this.vaccin = vaccin;
	}

	public Date getDerniereVisite() {
		return derniereVisite;
	}

	public void setDerniereVisite(Date derniereVisite) {
		this.derniereVisite = derniereVisite;
	}

	public String getTraitementEnCours() {
		return traitementEnCours;
	}

	public void setTraitementEnCours(String traitementEnCours) {
		this.traitementEnCours = traitementEnCours;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
}
