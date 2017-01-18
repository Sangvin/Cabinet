package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

import entite.DossierMedical;
import entite.FichePatient;
import entite.Medecin;
import entite.Ordonnance;
import entite.Patient;
import entite.RDV;

public class DoctorImpl extends UnicastRemoteObject implements IDoctorRemote {

	public DoctorImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<RDV> consultationRdv(Medecin medecin, Date date)
			throws RemoteException {
		ArrayList<RDV> liste = new ArrayList<>();
		// TODO recuperer rdv depuis la bdd
		/*
		 * select * 
		 * from rdv join medecin on rdv.medecin = medecin.id
		 * where medecin.id = medecin.getId() and date = rdv.date;
		 */
		return liste;
	}

	public boolean creationOrdonnance(Medecin medecin, Patient patient,
			String description, String nomCabinet) throws RemoteException {
		// TODO ajout dans la base
		/*
		 * insert into ordonnance
		 * (medecin, patient, desc, nom_cabinet)
		 * values (medecin.getId(), patient.getId(), description, nomCabinet);
		 */
		return false;
	}

	public FichePatient consultationFichePatient(Patient patient)
			throws RemoteException {
		FichePatient fiche = null;
		// TODO recuperer fichepatient depuis la bdd
		/*
		 * select *
		 * from fichepatient join patient on fichepatient.patient = patient.id
		 * where patient.id = patient.getId();
		 */
		return fiche;
	}

	public boolean creationDossierMedical(Patient patient,
			ArrayList<Ordonnance> listOrdonnance, ArrayList<String> vaccin,
			String traitementMedical, Medecin medecin) throws RemoteException {
		// TODO ajout dossiermedical bdd
		/*
		 * insert into
		 * dossiermedical (patient, vaccin, dernierevisite, traitementencour, medecin)
		 * values (...)
		 */
		// TODO creation ordonnance 
		return false;
	}

	public DossierMedical consultationDossierMedical(Patient patient)
			throws RemoteException {
		DossierMedical dossier = null;
		// TODO recuperer dossiermedical depuis bdd
		/*
		 * select *
		 * from dossiermedical where patient = patient;
		 */
		return dossier;
	}

	public boolean creationCertificat(Patient patient, Medecin medecin,
			String motif, Date date, String description, String nomCabinet)
			throws RemoteException {
		// TODO ajout certificat dans la base
		/*
		 * insert into
		 * certificat
		 */
		return false;
	}
}
