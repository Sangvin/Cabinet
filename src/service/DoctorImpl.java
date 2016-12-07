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
		// TODO Auto-generated method stub
		return null;
	}

	public boolean creationOrdonnance(Medecin medecin, Patient patient,
			String description, String nomCabinet) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public FichePatient consultationFichePatient(Patient patient)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public DossierMedical creationDossierMedical(Patient patient,
			ArrayList<Ordonnance> listOrdonnance, ArrayList<String> vaccin,
			String traitementMedical, Medecin medecin) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public DossierMedical consultationDossierMedical(Patient patient)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean creationCertificat(Patient patient, Medecin medecin,
			String motif, Date date, String description, String nomCabinet)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	

}
