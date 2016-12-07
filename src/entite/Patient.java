package entite;

import java.util.ArrayList;

public class Patient {
	private int id;
	private FichePatient fiche;
	private DossierMedical dossier;
	private ArrayList<RDV> listeRDV;
	private Certificat certificat;
	public Patient(int id, FichePatient fiche, DossierMedical dossier,
			ArrayList<RDV> listeRDV, Certificat certificat) {
		super();
		this.id = id;
		this.fiche = fiche;
		this.dossier = dossier;
		this.listeRDV = listeRDV;
		this.certificat = certificat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public FichePatient getFiche() {
		return fiche;
	}
	public void setFiche(FichePatient fiche) {
		this.fiche = fiche;
	}
	public DossierMedical getDossier() {
		return dossier;
	}
	public void setDossier(DossierMedical dossier) {
		this.dossier = dossier;
	}
	public ArrayList<RDV> getListeRDV() {
		return listeRDV;
	}
	public void setListeRDV(ArrayList<RDV> listeRDV) {
		this.listeRDV = listeRDV;
	}
	public Certificat getCertificat() {
		return certificat;
	}
	public void setCertificat(Certificat certificat) {
		this.certificat = certificat;
	}
	
	
}
