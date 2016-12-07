package entite;

public class Fournisseur {
	private int id;
	private String nom;
	private int tel;
	private String mail;
	private String adresse;
	
	public Fournisseur(int id, String nom, int tel, String mail,
			String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.tel = tel;
		this.mail = mail;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
