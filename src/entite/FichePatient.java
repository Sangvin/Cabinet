package entite;

import java.util.Date;

public class FichePatient {
	private int id;
	private Patient patient;
	private String nom;
	private String prenom;
	private Date inscription;
	private String adresse;
	private int tel;
	private String mail;
	private int numSecu;
	
	public FichePatient(int id, Patient patient, String nom, String prenom,
			Date inscription, String adresse, int tel, String mail, int numSecu) {
		super();
		this.id = id;
		this.patient = patient;
		this.nom = nom;
		this.prenom = prenom;
		this.inscription = inscription;
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
		this.numSecu = numSecu;
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

	public Date getInscription() {
		return inscription;
	}

	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(int numSecu) {
		this.numSecu = numSecu;
	}
	
	
}
