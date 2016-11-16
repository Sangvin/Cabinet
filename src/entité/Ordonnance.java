package entité;

public class Ordonnance {
	private int id;
	private Medecin medecin;
	private Patient patient;
	private String description;
	private String nomCabinet;
	
	public Ordonnance(int id, Medecin medecin, Patient patient,
			String description, String nomCabinet) {
		super();
		this.id = id;
		this.medecin = medecin;
		this.patient = patient;
		this.description = description;
		this.nomCabinet = nomCabinet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
