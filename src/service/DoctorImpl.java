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

	protected DoctorImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<RDV> consultationRdv(Medecin medecin, Date date)
			throws RemoteException {
		ArrayList<RDV> liste = new ArrayList<>();
		// TODO recuperer rdv depuis la bdd
		return liste;
	}

	public boolean creationOrdonnance(Medecin medecin, Patient patient,
			String description, String nomCabinet) throws RemoteException {
		// TODO ajout dans la base
		return false;
	}

	public FichePatient consultationFichePatient(Patient patient)
			throws RemoteException {
		FichePatient fiche = null;
		// TODO recuperer fichepatient depuis la bdd
		return fiche;
	}

	public boolean creationDossierMedical(Patient patient,
			ArrayList<Ordonnance> listOrdonnance, ArrayList<String> vaccin,
			String traitementMedical, Medecin medecin) throws RemoteException {
		// TODO ajout dossiermedical bdd
		// TODO creation ordonnance 
		return false;
	}

	public DossierMedical consultationDossierMedical(Patient patient)
			throws RemoteException {
		DossierMedical dossier = null;
		// TODO recuperer dossiermedical depuis bdd
		return dossier;
	}

	public boolean creationCertificat(Patient patient, Medecin medecin,
			String motif, Date date, String description, String nomCabinet)
			throws RemoteException {
		// TODO ajout certificat dans la base
		return false;
	}
}
