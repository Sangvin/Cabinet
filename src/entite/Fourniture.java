package entite;

import java.util.Date;

public class Fourniture {
	private int id;
	private String fournitures;
	private Medecin medecin;
	private Date date;
	private Fournisseur fournisseur;
	private int quantite;
	
	public Fourniture(int id, String fournitures, Medecin medecin, Date date,
			Fournisseur fournisseur, int quantite) {
		super();
		this.id = id;
		this.fournitures = fournitures;
		this.medecin = medecin;
		this.date = date;
		this.fournisseur = fournisseur;
		this.quantite = quantite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFournitures() {
		return fournitures;
	}
	public void setFournitures(String fournitures) {
		this.fournitures = fournitures;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
}
