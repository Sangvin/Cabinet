package service;



import entite.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

public interface IDoctorRemote extends Remote {

	public ArrayList<RDV> consultationRdv(Medecin medecin, Date date) throws RemoteException;
	public boolean creationOrdonnance(Medecin medecin, Patient patient, String description, String nomCabinet) throws RemoteException;
	public FichePatient consultationFichePatient(Patient patient) throws  RemoteException;
	public boolean creationDossierMedical(Patient patient, ArrayList<Ordonnance> listOrdonnance, ArrayList<String> vaccin,
			String traitementMedical, Medecin medecin) throws RemoteException;
	public DossierMedical consultationDossierMedical(Patient patient) throws RemoteException;
	public boolean creationCertificat(Patient patient, Medecin medecin, String motif, Date date, String description, String nomCabinet) throws RemoteException;
}
